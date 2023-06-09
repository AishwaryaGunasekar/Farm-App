package com.solvd.farmapp.services;

import java.util.List;

import com.solvd.farmapp.bin.crops;
import com.solvd.farmapp.dao.ICropsDAO;

public class CropsServiceImpl implements ICropsService {
	private ICropsDAO cropsDAO;

	public CropsServiceImpl(ICropsDAO cropsDAO) {
		this.cropsDAO = cropsDAO;
	}

	@Override
	public crops getCropsById(int id) {
		return cropsDAO.getById(id);
	}

	@Override
	public List<crops> getAllCrops() {
		return cropsDAO.getAll();
	}

	@Override
	public void saveCrops(crops crop) {
		cropsDAO.save(crop);
	}

	@Override
	public void updateCrops(crops crop) {
		cropsDAO.update(crop);
	}

	@Override
	public void deleteCrops(crops crop) {
		cropsDAO.delete(crop);
	}
}
