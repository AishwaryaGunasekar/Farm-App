package com.solvd.farmapp.services.mybatisimpl;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.farmapp.bin.LiveStock;

import com.solvd.farmapp.services.ILivestockService;

public class LiveStockService implements ILivestockService {

	private final static Logger LOGGER = LogManager.getLogger(LiveStockService.class);
	private static final String MYBATIS_CONFIG = "mybatis-config.xml";
	private final static String INSERT = "com.solvd.farmapp.mappers.LiveStockMapper.saveLivestock";
	private final static String DELETE = "com.solvd.farmapp.mappers.LiveStockMapper.deleteLivestock";
	private final static String UPDATE = "com.solvd.farmapp.mappers.LiveStockMapper.updateLivestock";

	public LiveStockService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveLivestock(LiveStock lvkstock) {
		if (lvkstock != null) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					session.insert(INSERT, lvkstock);
					session.commit();
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("livestock object is null.");
			throw new NullPointerException();
		}

	}

	@Override
	public void updateLivestock(LiveStock livestock) {
		if (livestock != null) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					session.update(UPDATE, livestock);
					session.commit();
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("livestock object is null.");
			throw new NullPointerException();
		}

	}

	@Override
	public void deleteLivestock(int lvestockid) {
		if (lvestockid > 0) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					session.delete(DELETE, lvestockid);
					session.commit();
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("livestock object is null.");
			throw new NullPointerException();
		}
	}

	@Override
	public LiveStock getLivestockById(int livestockid) {
		if (livestockid >= 1) {
			try (InputStream stream = Resources.getResourceAsStream(MYBATIS_CONFIG)) {
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
				try (SqlSession session = sessionFactory.openSession()) {
					return session.selectOne(INSERT, livestockid);
				}
			} catch (IOException e) {
				LOGGER.error("File Not Found");
				throw new RuntimeException(e);
			}
		} else {
			LOGGER.error("Invalid livestockid ID was entered.");
			throw new IllegalArgumentException("livestockid ID must be greater than or equal to 1");
		}
	}

}
