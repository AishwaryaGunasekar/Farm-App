package com.solvd.farmapp.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.farmapp.bin.Farm;
import com.solvd.farmapp.connections.ConnectionPool;
import com.solvd.farmapp.dao.IFarmDAO;

public class FarmDAO implements IFarmDAO {
	private static final Logger LOGGER = LogManager.getLogger(FarmDAO.class);
	private static final String getById = "SELECT * FROM Farm WHERE id = ?";
	private static final String getAll = "SELECT * FROM Farm";
	private static final String INSERT = "INSERT INTO Farm(id,name,address) VALUES (?,?,?)";
	private static final String UPDATE = "UPDATE Farm SET name = ? WHERE id = ?";
	private static final String DELETE = "DELETE FROM Farm WHERE id = ?";

	@Override
	public void getById(int id) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(getById)) {
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Farm farm = new Farm();
				farm.setId(resultSet.getInt("id"));
				farm.setName(resultSet.getString("name"));
				farm.setAddress(resultSet.getString("address"));
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

	@Override
	public List<Farm> getAll() {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		List<Farm> farms = new ArrayList<>();
		try (PreparedStatement statement = connection.prepareStatement(getAll);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Farm farm = new Farm();
				farm.setId(resultSet.getInt("id"));
				farm.setName(resultSet.getString("name"));
				farm.setAddress(resultSet.getString("address"));
				farms.add(farm);
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
		return farms;
	}

	@Override
	public void save(Farm farm) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(INSERT);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				statement.setInt(1, farm.getId());
				statement.setString(2, farm.getName());
				statement.setString(3, farm.getAddress());
				((PreparedStatement) resultSet).executeUpdate();
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

	@Override
	public void update(Farm farm) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(UPDATE);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				statement.setInt(1, farm.getId());
				statement.setString(2, farm.getName());
				statement.setString(3, farm.getAddress());
				statement.executeUpdate();
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

	@Override
	public void delete(Farm farm) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(DELETE);
				ResultSet resultSet = statement.executeQuery()) {
			statement.setInt(1, farm.getId());
			statement.setString(2, farm.getName());
			statement.setString(3, farm.getAddress());
			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}
}
