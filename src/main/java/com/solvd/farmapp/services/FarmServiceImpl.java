package com.solvd.farmapp.services;

import java.util.List;

import com.solvd.farmapp.dao.FarmDAO;
import com.solvd.farmapp.model.Farm;

public class FarmServiceImpl implements FarmService {
	private FarmDAO farmDAO;

	public FarmServiceImpl(FarmDAO farmDAO) {
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
