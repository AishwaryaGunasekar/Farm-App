package com.solvd.farmapplication;

import java.sql.*;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.farmapp.bin.Crops;
import com.solvd.farmapp.bin.Harvests;
import com.solvd.farmapp.bin.LiveStock;
import com.solvd.farmapp.dao.ICropsDAO;
import com.solvd.farmapp.dao.Impl.CropsDAO;
import com.solvd.farmapp.services.IHarvestsService;
import com.solvd.farmapp.services.ILivestockService;
import com.solvd.farmapp.services.Impl.HarvestsService;
import com.solvd.farmapp.bin.*;
import com.solvd.farmapp.bin.Farm;
import com.solvd.farmapp.bin.Farmers;
import com.solvd.farmapp.services.Impl.JAXBService;
import com.solvd.farmapp.services.Impl.JacksonService;
import com.solvd.farmapp.services.mybatisimpl.LiveStockService;
import com.solvd.farmapp.services.mybatisimpl.CropsService;
import com.solvd.farmapp.services.mybatisimpl.FarmService;

public class FarmApplication {

	public static final Logger LOGGER = LogManager.getLogger(FarmApplication.class);

	
	public static void main(String[] args) {

		CropsService cropservice = new CropsService();
		// Create a new crop
		Crops crop = new Crops(11, "crop1", "wheat", 33);
		cropservice.saveCrops(crop);
		LOGGER.info("Inserted crop: " + crop);

		// Get an crop by its ID
		int cropId = 1;
		Crops getcrop = cropservice.getCropsById(cropId);
		LOGGER.info("Retrieved crop: " + getcrop);

		FarmService farmservice = new FarmService();
		// Create a new farm
		Farm farm = new Farm();
		farmservice.saveFarm(farm);
		LOGGER.info("Inserted farm: " + farm);

		// Get an farm by its ID
		int farmId = 1;
		Farm getfarm = farmservice.getFarmById(farmId);
		LOGGER.info("Retrieved farm: " + getfarm);

		LiveStockService livestockservice = new LiveStockService();
		// Create a new farm
		LiveStock livestock = new LiveStock();
		livestockservice.saveLivestock(livestock);
		LOGGER.info("added livestock: " + livestock);

		// Create a new crop
		Crops crop1 = new Crops(8, "wheat", "Whrain", 80);
		ICropsDAO cropsDAO = new CropsDAO();
		cropsDAO.save(crop1);

		// Create a new instance of the service
		IHarvestsService harvestsService = new HarvestsService();

		// Create a new harvest object
		Harvests harvest = new Harvests(1, 1, 1, new Date(150322), 100);
		Harvests h1 = new Harvests(2, 2, 2, new Date(16 - 03 - 2023), 1000);

		// Save the harvest
		harvestsService.saveHarvest(harvest);
		harvestsService.saveHarvest(h1);
		LOGGER.info("Harvest saved: " + harvest);

		// Get a specific harvest by ID
		Harvests retrievedHarvest = harvestsService.getHarvestById(1);
		LOGGER.info("Retrieved harvest: " + retrievedHarvest);

		// Update the harvested quantity
		retrievedHarvest.setHarvested_Quantity(200);
		harvestsService.updateHarvest(retrievedHarvest);
		LOGGER.info("Harvest updated: " + retrievedHarvest);

		// Get all harvests
		List<Harvests> allHarvests = harvestsService.getAllHarvests();
		LOGGER.info("All harvests: " + allHarvests);

		// Delete the harvest
		harvestsService.deleteHarvest(1);
		LOGGER.info("Harvest deleted.");

		// Verify the harvest was deleted
		Harvests deletedHarvest = harvestsService.getHarvestById(1);
		LOGGER.info("Deleted harvest: " + deletedHarvest);

		// Create a livestock object
		LiveStock livestck = new LiveStock(1, "Cow", "mari", "10");

		// Create an instance of the service
		ILivestockService livestockService = new LiveStockService();

		// Save the livestock
		livestockService.saveLivestock(livestck);

		// Update the livestock
		livestck.setLivestock_Quantity("20");
		livestockService.updateLivestock(livestck);

		// Delete the livestock
		livestockService.deleteLivestock(livestck.getLivestock_Id());

		// Retrieve a livestock by ID
		int livestockId = 1;
		LiveStock retrievedLivestock = livestockService.getLivestockById(livestockId);
		LOGGER.info("Retrieved livestock: " + retrievedLivestock);

		// JAXB marshalling
		@SuppressWarnings("rawtypes")
		JAXBService jaxbservice = new JAXBService();
		jaxbservice.getClass();
		Farm farmq = new Farm();
		farmq.getId();
		String farmXmlFile = "src/main/resources/Farm.xml";
		jaxbservice.marshal(retrievedLivestock, farmXmlFile, farmXmlFile);
		

		// JAXB unmarshalling
		String farmerstXmlFile = "src/main/resources/xml/Farmers.xml";
		Farmers farmers = jaxbservice.unmarshall(farmerstXmlFile);
		LOGGER.info("Farmers details: " + farmers.getFarmer_Id() + ", " + farmers.getFarmer_Name() + ", "
				+ farmers.getFarmer_Address() + ", " + farmers.getFarmer_Phone());

		// JACKSON Serialize
		@SuppressWarnings("rawtypes")
		JacksonService jcksonservice = new JacksonService();
		LiveStock livestoock = new LiveStock();
		livestoock.setLivestock_Id(livestockId);
		String file = "src/main/resources/json/Livestock.json";
		jcksonservice.serialize(livestock, file);

		Sales sales = new Sales();
		String file1 = "src/main/resources/EquipmentInventor.json";
		jcksonservice.serialize(sales, file1);
		LOGGER.info("Serialization completed successfully.");

		// JACKSON Deserialize
		jcksonservice = new JacksonService();
		String JsonFile = "src/main/resources/json/Crop.json";
		String JsonFile1 = "src/main/resources/json/Farm.json";
		Crops crop2 = JacksonService.deserialize(JsonFile);
		Crops farm1 = JacksonService.deserialize(JsonFile1);
		LOGGER.info(crop2);
		LOGGER.info(farm1);
	}

}
