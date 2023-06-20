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
import com.solvd.farmapp.dao.IFarmDAO;
import com.solvd.farmapp.util.ConnectionPool;

public class FarmDAO implements IFarmDAO {
	private static final Logger LOGGER = LogManager.getLogger(FarmDAO.class);
	private static final ConnectionPool connectionPool = ConnectionPool.getInstance();
	private Connection connection;

	public FarmDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public Farm getById(int id) {
		String sql = "SELECT * FROM farms WHERE id = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Farm farm = new Farm();
				farm.setId(resultSet.getInt("id"));
				farm.setName(resultSet.getString("name"));
				farm.setAddress(resultSet.getString("address"));

				return farm;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Farm> getAll() {
		String sql = "SELECT * FROM farms";
		List<Farm> farms = new ArrayList<>();
		try (PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Farm farm = new Farm();
				farm.setId(resultSet.getInt("id"));
				farm.setName(resultSet.getString("name"));
				farm.setAddress(resultSet.getString("address"));
				farms.add(farm);
			}
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		} finally {
			connectionPool.releaseConnection(connection);
		}
		return farms;
	}

	@Override
	public void save(Farm farm) {

		String sql = "INSERT INTO farms(id,Name,Address) VALUES (?,?,?)";
		try (PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				statement.setInt(1, farm.getId());
				statement.setString(2, farm.getName());
				statement.setString(3, farm.getAddress());
				((PreparedStatement) resultSet).executeUpdate();
			}
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}

	@Override
	public void update(Farm farm) {
		
		String sql = "UPDATE farms SET name = ? WHERE id = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				statement.setInt(1, farm.getId());
				statement.setString(2, farm.getName());
				statement.setString(3, farm.getAddress());
				statement.executeUpdate();
			}
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

	@Override
	public void delete(Farm farm) {
		String sql = "DELETE FROM farms WHERE id = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			statement.setInt(1, farm.getId());
			statement.setString(2, farm.getName());
			statement.setString(3, farm.getAddress());
			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}
}
