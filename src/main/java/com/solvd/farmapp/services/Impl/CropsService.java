package com.solvd.farmapp.services.Impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.farmapp.bin.Crops;
import com.solvd.farmapp.dao.ICropsDAO;
import com.solvd.farmapp.dao.Impl.CropsDAO;
import com.solvd.farmapp.services.ICropsService;

public class CropsService implements ICropsService {

	private final static Logger LOGGER = LogManager.getLogger(CropsService.class);
	private ICropsDAO cropsDAO;

	public CropsService(ICropsDAO cropsDAO) {
		this.cropsDAO = cropsDAO;
	}

	public CropsService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Crops> getAllCrops() {
		return cropsDAO.getAll();
	}

	@Override
	public void saveCrops(Crops crop) {
		if (crop != null) {
			ICropsDAO icropsdao = new CropsDAO();
			icropsdao.save(crop);
		} else {
			LOGGER.error("crops object is NULL.");
			throw new NullPointerException();
		}
	}

	@Override
	public void updateCrops(Crops crop) {
		if (crop != null) {
			ICropsDAO icropsdao = new CropsDAO();
			icropsdao.update(crop);

		} else {
			LOGGER.error("crop object is null.");
			throw new NullPointerException();
		}
	}

	@Override
	public void deleteCrops(Crops cropsid) {
		if (cropsid != null) {
			ICropsDAO icropsdao = new CropsDAO();
			icropsdao.delete(cropsid);
		} else {
			LOGGER.error("Invalid cropid was entered.");
			throw new NullPointerException("cropid must be 1 or greater");
		}
	}

	@Override
	public Crops getCropsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
