package com.solvd.farmapp.services.mybatisimpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.farmapp.bin.Farm;
import com.solvd.farmapp.dao.IFarmDAO;
import com.solvd.farmapp.services.IFarmService;

public class FarmService implements IFarmService {

	private final static Logger LOGGER = LogManager.getLogger(FarmService.class);
	private static final String MYBATIS_CONFIG = "mybatis-config.xml";
	private final static String INSERT = "com.solvd.farmapp.mappers.FarmMapper.saveCrops";
	private final static String DELETE = "com.solvd.farmapp.mappers.FarmMapper.deleteCrops";
	private final static String UPDATE = "com.solvd.farmapp.mappers.FarmMapper.updateCrops";

	private IFarmDAO farmDAO;

	public FarmService(IFarmDAO farmDAO) {
		this.farmDAO = farmDAO;
	}

	public FarmService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveFarm(Farm farm) {
		if (farm != null) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					session.insert(INSERT, farm);
					session.commit();
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("farm object is null.");
			throw new NullPointerException();
		}

	}

	@Override
	public void updateFarm(Farm farm) {
		if (farm != null) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					session.update(UPDATE, farm);
					session.commit();
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("farm object is null.");
			throw new NullPointerException();
		}

	}

	@Override
	public void deleteFarm(Farm farmid) {
		if (farmid != null) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					session.delete(DELETE, farmid);
					session.commit();
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("farm object is null.");
			throw new NullPointerException();
		}
	}

	@Override
	public List<Farm> getAllFarms() {
		return farmDAO.getAll();
	}

	@Override
	public Farm getFarmById(int farmId) {
		if (farmId >= 1) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					return session.selectOne(INSERT, farmId);
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("Invalid farm ID was entered.");
			throw new IllegalArgumentException("farm ID must be greater than or equal to 1");
		}
	}
}
