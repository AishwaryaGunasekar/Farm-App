package com.solvd.farmapp.services.Impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.farmapp.bin.Farm;
import com.solvd.farmapp.dao.IFarmDAO;
import com.solvd.farmapp.dao.Impl.FarmDAO;
import com.solvd.farmapp.services.IFarmService;

public class FarmService implements IFarmService {
	private final static Logger LOGGER = LogManager.getLogger(FarmService.class);
	private IFarmDAO farmDAO;

	public FarmService(IFarmDAO farmDAO) {
		this.farmDAO = farmDAO;
	}

	@Override
	public void saveFarm(Farm farm) {
		if (farm != null) {
			IFarmDAO ifarmdao = new FarmDAO();
			ifarmdao.save(farm);
		} else {
			LOGGER.error("farm object is NULL.");
			throw new NullPointerException();
		}
	}

	@Override
	public void updateFarm(Farm farm) {
		if (farm != null) {
			IFarmDAO ifarmdao = new FarmDAO();
			ifarmdao.update(farm);
		} else {
			LOGGER.error("farm object is NULL.");
			throw new NullPointerException();
		}
	}

	@Override
	public void deleteFarm(Farm farm) {
		if (farm != null) {
			IFarmDAO ifarmdao = new FarmDAO();
			ifarmdao.delete(farm);
		} else {
			LOGGER.error("farm object is NULL.");
			throw new NullPointerException();
		}
	}

	@Override
	public Farm getFarmById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Farm> getAllFarms() {
		return farmDAO.getAll();
	}
}
