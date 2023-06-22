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
import com.solvd.farmapp.bin.Crops;
import com.solvd.farmapp.dao.ICropsDAO;
import com.solvd.farmapp.services.ICropsService;

public class CropsService implements ICropsService {
	private final static Logger LOGGER = LogManager.getLogger(CropsService.class);
	private static final String MYBATIS_CONFIG = "mybatis-config.xml";
	private final static String INSERT = "com.solvd.farmapp.mappers.CropsMapper.saveCrops";
	private final static String DELETE = "com.solvd.farmapp.mappers.CropsMapper.deleteCrops";
	private final static String UPDATE = "com.solvd.farmapp.mappers.CropsMapper.updateCrops";

	private ICropsDAO cropsDAO;

	public CropsService(ICropsDAO cropsDAO) {
		this.cropsDAO = cropsDAO;
	}

	public CropsService() {

	}

	@Override
	public void saveCrops(Crops crop) {
		if (crop != null) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					session.insert(INSERT, crop);
					session.commit();
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("crop object is null.");
			throw new NullPointerException();
		}

	}

	@Override
	public void updateCrops(Crops crop) {
		if (crop != null) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					session.update(UPDATE, crop);
					session.commit();
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("crop object is null.");
			throw new NullPointerException();
		}

	}

	@Override
	public void deleteCrops(Crops cropsid) {
		if (cropsid != null) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					session.delete(DELETE, cropsid);
					session.commit();
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("crop object is null.");
			throw new NullPointerException();
		}
	}

	@Override
	public List<Crops> getAllCrops() {
		return cropsDAO.getAll();
	}

	@Override
	public Crops getCropsById(int cropsId) {
		if (cropsId >= 1) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					return session.selectOne(INSERT, cropsId);
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("Invalid crop ID was entered.");
			throw new IllegalArgumentException("crop ID must be greater than or equal to 1");
		}
	}

}
