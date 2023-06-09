package com.solvd.farmapp.services;

import com.solvd.farmapp.bin.harvests;
import com.solvd.farmapp.dao.IHarvestsDAO;
import com.solvd.farmapp.dao.HarvestsDAOImpl;
import java.util.List;

public class HarvestsServiceImpl implements IHarvestsService {

	private IHarvestsDAO harvestsDAO;

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
