package com.solvd.farmapplication;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.solvd.farmapp.bin.crops;
import com.solvd.farmapp.bin.harvests;
import com.solvd.farmapp.bin.livestock;
import com.solvd.farmapp.dao.ICropsDAO;
import com.solvd.farmapp.dao.Impl.CropsDAO;
import com.solvd.farmapp.services.IHarvestsService;
import com.solvd.farmapp.services.ILivestockService;
import com.solvd.farmapp.services.Impl.HarvestsServiceImpl;
import com.solvd.farmapp.services.Impl.LivestockServiceImpl;

public class FarmApplication {

	public static final Logger LOGGER = LogManager.getLogger(FarmApplication.class);
	public static void main(String[] args) {


		String dbUrl = "jdbc:mysql://localhost:3306/farm-app-db";
		String username = "root";
		String password = "12345Aishwarya$*";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dbUrl, username, password);
			ICropsDAO cropsDAO = new CropsDAO(connection);
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
			IHarvestsService harvestsService = new HarvestsServiceImpl();

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
			ILivestockService livestockService = new LivestockServiceImpl();

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

			
		//FARMXMLParser 
			String xmlFilePath1 = "farm.xml";

	        
	            // Create a DocumentBuilderFactory
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	            // Create a DocumentBuilder using the DOM parser
	            DocumentBuilder builder = factory.newDocumentBuilder();

	            // Parse the XML file
	            Document document = builder.parse(new File(xmlFilePath1));

	            // Get the root element
	            Element rootElement = document.getDocumentElement();

	            // Get the farm elements
	            NodeList farmList = rootElement.getElementsByTagName("farm");

	            // Process each farm element
	            for (int i = 0; i < farmList.getLength(); i++) {
	                Element farmElement = (Element) farmList.item(i);

	                // Get the farm attributes
	                int id = Integer.parseInt(farmElement.getAttribute("id"));
	                String name = farmElement.getAttribute("name");
	                String address = farmElement.getAttribute("address");

	                // Printing  farm details
	                LOGGER.info("Farm Details:");
	                LOGGER.info("ID: " + id);
	                LOGGER.info("Name: " + name);
	                LOGGER.info("Address: " + address);
	            
	            }
	 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
