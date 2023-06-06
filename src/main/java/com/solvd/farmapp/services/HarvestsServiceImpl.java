package com.solvd.farmapp.services;

import com.solvd.farmapp.dao.HarvestsDAO;
import com.solvd.farmapp.dao.HarvestsDAOImpl;
import com.solvd.farmapp.model.harvests;

import java.util.List;

public class HarvestsServiceImpl implements HarvestsService {

	private HarvestsDAO harvestsDAO;

	public HarvestsServiceImpl() {
		harvestsDAO = new HarvestsDAOImpl();
	}

	@Override
	public harvests getHarvestById(int harvestId) {
		return harvestsDAO.getHarvestById(harvestId);
	}

	@Override
	public List<harvests> getAllHarvests() {
		return harvestsDAO.getAllHarvests();
	}

	@Override
	public void saveHarvest(harvests harvest) {
		harvestsDAO.saveHarvest(harvest);
	}

	@Override
	public void updateHarvest(harvests harvest) {
		harvestsDAO.updateHarvest(harvest);
	}

	@Override
	public void deleteHarvest(int harvestId) {
		harvestsDAO.deleteHarvest(harvestId);
	}
}
