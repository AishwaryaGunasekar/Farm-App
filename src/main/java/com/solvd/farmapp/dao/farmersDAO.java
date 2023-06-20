package com.solvd.farmapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.*;

import com.solvd.farmapp.bin.farmers;
import com.solvd.farmapp.util.ConnectionPool;

public class farmersDAO {

	private static final String URL = "jdbc:mysql://localhost:3306/farm-app-db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "12345Aishwarya$*";
	private static final String SQL = "Select * from farmers";
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet results = null;

	private static farmersDAO instance;

	public farmersDAO() {

	}

	public static farmersDAO getInstance() {
		if (instance == null) {
			instance = new farmersDAO();
		}
		return instance;
	}

	public farmers getById(long id) {
		farmers f = new farmers();
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT * FROM farmers WHERE farmer_id=?");
			preparedStatement.setLong(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				f.setFarmer_id(resultSet.getInt("Farmer_id"));
				f.setFarmer_name(resultSet.getString("Farmer_Name"));

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		connectionPool.releaseConnection(connection);
		return f;
	}

	public List<farmers> findAllFarmers() {
		List<farmers> f1 = new ArrayList<farmers>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(SQL);
			results = statement.executeQuery();
			while (results.next())

			{
				int farmer_id = results.getInt("farmer_id");
				String farmer_name = results.getString("farmer_name");
				String farmer_address = results.getString("farmer_address");
				int farmer_phone = results.getInt("farmer_phone");
				farmers f2 = new farmers(farmer_id, farmer_name, farmer_address, farmer_phone);
				f1.add(f2);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return f1;

	}

}
