package com.solvd.farmapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.solvd.farmapp.model.Farm;

public class FarmDAOImpl implements FarmDAO {
    private Connection connection;
  
    
    public FarmDAOImpl(Connection connection) {
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
            e.printStackTrace();
        }
        return farms;
    }
    
    @Override
    public void save(Farm farm) {
        String sql = "INSERT INTO farms (name) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, farm.getName());
         
            
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void update(Farm farm) {
        String sql = "UPDATE farms SET name = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, farm.getName());
           
            statement.setInt(2, farm.getId());
            
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void delete(Farm farm) {
        String sql = "DELETE FROM farms WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, farm.getId());
            
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
