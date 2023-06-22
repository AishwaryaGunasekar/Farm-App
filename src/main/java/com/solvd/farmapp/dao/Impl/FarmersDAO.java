package com.solvd.farmapp.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import com.solvd.farmapp.bin.Farmers;
import com.solvd.farmapp.connections.ConnectionPool;
import com.solvd.farmapp.dao.IFarmersDAO;

public class FarmersDAO implements IFarmersDAO {

	private static final Logger LOGGER = LogManager.getLogger(FarmDAO.class);
	private static final String getById = "SELECT * FROM farmers WHERE id = ?";
	private static final String getAll = "SELECT * FROM farmers";
	private static final String INSERT = "INSERT INTO farmers(id,Name,Address,phone) VALUES (?,?,?,?)";
	private static final String UPDATE = "UPDATE farmers SET name = ? WHERE id = ?";
	private static final String DELETE = "DELETE FROM farmers WHERE id = ?";

	@Override
	public void getById(int id) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(getById)) {
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Farmers farmers = new Farmers();
				farmers.setFarmer_Id(resultSet.getInt("farmers_id"));
				farmers.setFarmer_Name(resultSet.getString("farmers_name"));
				farmers.setFarmer_Address(resultSet.getString("farmers_name"));
				farmers.setFarmer_Phone(resultSet.getInt("farmers_Phone"));
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

	@Override
	public List<Farmers> getAll() {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		List<Farmers> farmers = new ArrayList<>();
		try (PreparedStatement statement = connection.prepareStatement(getAll);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Farmers frms = new Farmers();
				frms.setFarmer_Id(resultSet.getInt("id"));
				frms.setFarmer_Name(resultSet.getString("name"));
				frms.setFarmer_Address(resultSet.getString("address"));
				frms.setFarmer_Phone(resultSet.getInt("phone"));
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
		return farmers;
	}

	@Override
	public void save(Farmers farmers) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(INSERT);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				statement.setInt(1, farmers.getFarmer_Id());
				statement.setString(2, farmers.getFarmer_Name());
				statement.setString(3, farmers.getFarmer_Address());
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
	public void update(Farmers farmers) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(UPDATE);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				statement.setInt(1, farmers.getFarmer_Id());
				statement.setString(2, farmers.getFarmer_Name());
				statement.setString(3, farmers.getFarmer_Address());
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
	public void delete(Farmers farmers) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(DELETE);
				ResultSet resultSet = statement.executeQuery()) {
			statement.setInt(1, farmers.getFarmer_Id());
			statement.setString(2, farmers.getFarmer_Name());
			statement.setString(3, farmers.getFarmer_Address());
			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

}
