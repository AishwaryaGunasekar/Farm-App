package com.solvd.farmapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.solvd.farmapp.model.crops;

public class CropsDAOImpl implements CropsDAO {
	private Connection connection;

	public CropsDAOImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public crops getById(int id) {
		String sql = "SELECT * FROM crops WHERE crop_id = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				crops crop = new crops();
				crop.setCrop_id(resultSet.getInt("crop_id"));
				crop.setCrop_name(resultSet.getString("crop_name"));
				crop.setCrop_type(resultSet.getString("crop_type"));
				crop.setCrop_yield(resultSet.getInt("crop_yield"));

				return crop;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<crops> getAll() {
		String sql = "SELECT * FROM crops";
		List<crops> cropsList = new ArrayList<>();
		try (PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				crops crop = new crops();
				crop.setCrop_id(resultSet.getInt("crop_id"));
				crop.setCrop_name(resultSet.getString("crop_name"));
				crop.setCrop_type(resultSet.getString("crop_type"));
				crop.setCrop_yield(resultSet.getInt("crop_yield"));

				cropsList.add(crop);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cropsList;
	}

	@Override
	public void save(crops crop) {
		String sql = "INSERT INTO crops (crop_name, crop_type, crop_yield) VALUES (?, ?, ?)";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setString(1, crop.getCrop_name());
			statement.setString(2, crop.getCrop_type());
			statement.setInt(3, crop.getCrop_yield());

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(crops crop) {
		String sql = "UPDATE crops SET crop_name = ?, crop_type = ?, crop_yield = ? WHERE crop_id = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setString(1, crop.getCrop_name());
			statement.setString(2, crop.getCrop_type());
			statement.setInt(3, crop.getCrop_yield());
			statement.setInt(4, crop.getCrop_id());

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(crops crop) {
		String sql = "DELETE FROM crops WHERE crop_id = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, crop.getCrop_id());

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
