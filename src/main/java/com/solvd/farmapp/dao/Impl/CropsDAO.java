package com.solvd.farmapp.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.farmapp.bin.Crops;
import com.solvd.farmapp.connections.ConnectionPool;
import com.solvd.farmapp.dao.ICropsDAO;

public class CropsDAO implements ICropsDAO {
	private static final Logger LOGGER = LogManager.getLogger(CropsDAO.class);
	private static final String INSERT = "INSERT INTO Crops (cropname, croptype, cropyield) VALUES (?, ?, ?)";
	private static final String UPDATE = "UPDATE Crops SET cropname = ?, croptype = ?, cropyield = ? WHERE cropid = ?";
	private static final String DELETE = "DELETE FROM Crops WHERE cropid = ?";
	private static final String getByID = "SELECT * FROM Crops WHERE cropid = ?";
	private static final String getAll = "SELECT * FROM Crops";

	@Override
	public void getById(int id) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(getByID)) {
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Crops crop = new Crops();
				crop.setCropId(resultSet.getInt("cropid"));
				crop.setCropName(resultSet.getString("cropname"));
				crop.setCropType(resultSet.getString("croptype"));
				crop.setCropYield(resultSet.getInt("cropyield"));
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}

	@Override
	public List<Crops> getAll() {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		List<Crops> cropsList = new ArrayList<>();
		try (PreparedStatement statement = connection.prepareStatement(getAll);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Crops crop = new Crops();
				crop.setCropId(resultSet.getInt("cropid"));
				crop.setCropName(resultSet.getString("cropname"));
				crop.setCropType(resultSet.getString("croptype"));
				crop.setCropYield(resultSet.getInt("cropyield"));
				cropsList.add(crop);
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
		return cropsList;
	}

	@Override
	public void save(Crops crop) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
			statement.setString(1, crop.getCropName());
			statement.setString(2, crop.getCropType());
			statement.setInt(3, crop.getCropYield());
			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}

	@Override
	public void update(Crops crop) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(UPDATE)) {
			statement.setString(1, crop.getCropName());
			statement.setString(2, crop.getCropType());
			statement.setInt(3, crop.getCropYield());
			statement.setInt(4, crop.getCropId());
			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}

	@Override
	public void delete(Crops crop) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(DELETE)) {
			statement.setInt(1, crop.getCropId());
			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}
}
