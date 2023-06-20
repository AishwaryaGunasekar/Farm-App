package com.solvd.farmapp.services.Impl;

import java.util.List;

import com.solvd.farmapp.bin.Farm;
import com.solvd.farmapp.dao.IFarmDAO;
import com.solvd.farmapp.services.IFarmService;

public class FarmService implements IFarmService {
	private IFarmDAO farmDAO;

	public FarmService(IFarmDAO farmDAO) {
		this.farmDAO = farmDAO;
	}

	@Override
	public Farm getFarmById(int id) {
		return farmDAO.getById(id);
	}

	@Override
	public List<Farm> getAllFarms() {
		return farmDAO.getAll();
	}

	@Override
	public void saveFarm(Farm farm) {
		farmDAO.save(farm);
	}

	@Override
	public void updateFarm(Farm farm) {
		farmDAO.update(farm);
	}

	@Override
	public void deleteFarm(Farm farm) {
		farmDAO.delete(farm);
	}
}
