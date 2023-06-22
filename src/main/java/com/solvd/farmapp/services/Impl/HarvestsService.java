package com.solvd.farmapp.services.Impl;

import com.solvd.farmapp.bin.Harvests;
import com.solvd.farmapp.dao.IHarvestsDAO;
import com.solvd.farmapp.services.IHarvestsService;

import java.util.List;

public class HarvestsService implements IHarvestsService {

	private IHarvestsDAO harvestsDAO;

	@Override
	public Harvests getHarvestById(int harvestId) {
		return harvestsDAO.getHarvestById(harvestId);
	}

	@Override
	public List<Harvests> getAllHarvests() {
		return harvestsDAO.getAllHarvests();
	}

	@Override
	public void saveHarvest(Harvests harvest) {

		harvestsDAO.saveHarvest(harvest);
	}

	@Override
	public void updateHarvest(Harvests harvest) {
		harvestsDAO.updateHarvest(harvest);
	}

	@Override
	public void deleteHarvest(int harvestId) {
		harvestsDAO.deleteHarvest(harvestId);
	}
}
