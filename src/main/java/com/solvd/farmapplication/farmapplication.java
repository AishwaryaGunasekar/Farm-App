package com.solvd.farmapplication;

import java.sql.*;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.farmapp.dao.CropsDAO;
import com.solvd.farmapp.dao.CropsDAOImpl;
import com.solvd.farmapp.model.crops;
import com.solvd.farmapp.dao.HarvestsDAO;

import com.solvd.farmapp.services.HarvestsService;
import com.solvd.farmapp.services.HarvestsServiceImpl;
import com.solvd.farmapp.model.harvests;

import com.solvd.farmapp.services.LivestockService;
import com.solvd.farmapp.services.LivestockServiceImpl;
import com.solvd.farmapp.model.livestock;

public class farmapplication {
	public static void main(String[] args) {

		final Logger LOGGER = LogManager.getLogger(farmapplication.class);

		String dbUrl = "jdbc:mysql://localhost:3306/farm-app-db";
		String username = "root";
		String password = "12345Aishwarya$*";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dbUrl, username, password);
			CropsDAO cropsDAO = new CropsDAOImpl(connection);
			// Create a new crop
			crops crop1 = new crops(8, "wheat", "Whrain", 80);
			cropsDAO.save(crop1);
			// Get a crop by ID
			crops fetchedCrop = cropsDAO.getById(1);
			LOGGER.info("Fetched Crop: " + fetchedCrop);
			// Update a crop fetchedCrop.setCrop_yield(150);
			cropsDAO.update(fetchedCrop);
			// Get all crops
			List<crops> allCrops = cropsDAO.getAll();
			LOGGER.info("All Crops:");
			for (crops crop : allCrops) {
				System.out.println(crop);
			}
			// Delete a crop
			cropsDAO.delete(fetchedCrop);

			// Create a new instance of the service
			HarvestsService harvestsService = new HarvestsServiceImpl();

			// Create a new harvest object
			harvests harvest = new harvests(1, 1, 1, new Date(150322), 100);
			harvests h1 = new harvests(2, 2, 2, new Date(16 - 03 - 2023), 1000);

			// Save the harvest
			harvestsService.saveHarvest(harvest);
			harvestsService.saveHarvest(h1);
			System.out.println("Harvest saved: " + harvest);

			// Get a specific harvest by ID
			harvests retrievedHarvest = harvestsService.getHarvestById(1);
			System.out.println("Retrieved harvest: " + retrievedHarvest);

			// Update the harvested quantity
			retrievedHarvest.setHarvested_quantity(200);
			harvestsService.updateHarvest(retrievedHarvest);
			System.out.println("Harvest updated: " + retrievedHarvest);

			// Get all harvests
			List<harvests> allHarvests = harvestsService.getAllHarvests();
			System.out.println("All harvests: " + allHarvests);

			// Delete the harvest
			harvestsService.deleteHarvest(1);
			System.out.println("Harvest deleted.");

			// Verify the harvest was deleted
			harvests deletedHarvest = harvestsService.getHarvestById(1);
			System.out.println("Deleted harvest: " + deletedHarvest);

			// Create a livestock object
			livestock livestck = new livestock(1, "Cow", "mari", "10");

			// Create an instance of the service
			LivestockService livestockService = new LivestockServiceImpl();

			// Save the livestock
			livestockService.saveLivestock(livestck);

			// Update the livestock
			livestck.setLivestock_quantity("20");
			livestockService.updateLivestock(livestck);

			// Delete the livestock
			livestockService.deleteLivestock(livestck.getLivestock_id());

			// Retrieve a livestock by ID
			int livestockId = 1;
			livestock retrievedLivestock = livestockService.getLivestockById(livestockId);
			System.out.println("Retrieved livestock: " + retrievedLivestock);
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
