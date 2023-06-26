package com.solvd.farmapp.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.solvd.farmapp.bin.Sales;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.farmapp.connections.ConnectionPool;
import com.solvd.farmapp.dao.ISalesDAO;

public class SalesDAO implements ISalesDAO {

	private static final Logger LOGGER = LogManager.getLogger(CropsDAO.class);
	private static final String INSERT = "INSERT INTO Sales (saleid,cropid,salequantity,salesprice) VALUES (?, ?, ?,?)";
	private static final String UPDATE = "UPDATE Sales SET salequantity=?,salesprice=? where saleid=?";
	private static final String DELETE = "DELETE FROM Sales WHERE cropid = ?";
	private static final String getByID = "SELECT * FROM Sales WHERE cropid = ?";
	private static final String getAll = "SELECT * FROM Sales";

	@Override
	public void getById(int id) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(getByID)) {
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Sales sales = new Sales();
				sales.setCropId(resultSet.getInt("cropid"));
				sales.setSaleId(resultSet.getInt("saleid"));
				sales.setSalePrice(resultSet.getInt("saleprice"));
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}

	@Override
	public List<Sales> getAll() {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		List<Sales> salesList = new ArrayList<>();
		try (PreparedStatement statement = connection.prepareStatement(getAll);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Sales sales = new Sales();
				sales.setCropId(resultSet.getInt("cropid"));
				sales.setSaleId(resultSet.getInt("saleid"));
				sales.setSalePrice(resultSet.getInt("saleprice"));
				salesList.add(sales);
			}
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}
		return salesList;

	}

	@Override
	public void save(Sales sale) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
			statement.setInt(1, sale.getSaleId());
			statement.setInt(2, sale.getSaleQuantity());
			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement.");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}

	@Override
	public void update(Sales sale) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(UPDATE)) {
			statement.setInt(1, sale.getSaleId());
			statement.setInt(2, sale.getSaleQuantity());

			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}

	@Override
	public void delete(Sales sale) {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(DELETE)) {
			statement.setInt(1, sale.getSaleId());
			statement.setInt(2, sale.getSaleQuantity());
			statement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error("Unable to execute Prepared Statement");
			throw new RuntimeException(e);
		} finally {
			connectionPool.releaseConnection(connection);
		}

	}
}
