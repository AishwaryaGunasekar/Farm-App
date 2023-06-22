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
	private static final String INSERT = "INSERT INTO crops (crop_name, crop_type, crop_yield) VALUES (?, ?, ?)";
	private static final String UPDATE = "UPDATE crops SET crop_name = ?, crop_type = ?, crop_yield = ? WHERE crop_id = ?";
	private static final String DELETE = "DELETE FROM crops WHERE crop_id = ?";
	private static final String getByID = "SELECT * FROM crops WHERE crop_id = ?";
	private static final String getAll = "SELECT * FROM crops";

	@Override
	public void getById(int id) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(getByID)) {
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Crops crop = new Crops();
				crop.setCrop_Id(resultSet.getInt("crop_id"));
				crop.setCrop_Name(resultSet.getString("crop_name"));
				crop.setCrop_Type(resultSet.getString("crop_type"));
				crop.setCrop_Yield(resultSet.getInt("crop_yield"));
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
				crop.setCrop_Id(resultSet.getInt("crop_id"));
				crop.setCrop_Name(resultSet.getString("crop_name"));
				crop.setCrop_Type(resultSet.getString("crop_type"));
				crop.setCrop_Yield(resultSet.getInt("crop_yield"));
				cropsList.add(crop);
			}
		}  catch (SQLException e) {
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
			statement.setString(1, crop.getCrop_Name());
			statement.setString(2, crop.getCrop_Type());
			statement.setInt(3, crop.getCrop_Yield());
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
			statement.setString(1, crop.getCrop_Name());
			statement.setString(2, crop.getCrop_Type());
			statement.setInt(3, crop.getCrop_Yield());
			statement.setInt(4, crop.getCrop_Id());
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
			statement.setInt(1, crop.getCrop_Id());
			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}
}
