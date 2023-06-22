package com.solvd.farmapp.dao.Impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.farmapp.bin.LiveStock;
import com.solvd.farmapp.dao.ILivestockDAO;


public class LiveStockDAO implements ILivestockDAO {

	public static final Logger LOGGER = LogManager.getLogger(LiveStockDAO.class);

	@Override
	public void saveLivestock(LiveStock livestck) {
		// Implementation to save the livestock to a database
		LOGGER.info("Saving livestock: " + livestck);
	}

	@Override
	public void updateLivestock(LiveStock livestck) {
		// Implementation to update the livestock in the database
		LOGGER.info("Updating livestock: " + livestck);
	}

	@Override
	public void deleteLivestock(int livestockId) {
		// Implementation to delete the livestock from the database
		LOGGER.info("Deleting livestock with ID: " + livestockId);
	}

	@Override
	public LiveStock getLivestockById(int livestockId) {
		// Implementation to retrieve the livestock from the database
		return new LiveStock(livestockId, "Dummy Type", "Dummy Breed", "Dummy Quantity");
	}
}
