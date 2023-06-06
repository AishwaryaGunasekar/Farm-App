package com.solvd.farmapp.services;

import com.solvd.farmapp.dao.LivestockDAO;
import com.solvd.farmapp.dao.LivestockDAOImpl;

import com.solvd.farmapp.model.livestock;

public class LivestockServiceImpl implements LivestockService {

	private LivestockDAO livestockDAO;

	public LivestockServiceImpl() {
		livestockDAO = new LivestockDAOImpl();
	}

	@Override
	public void saveLivestock(livestock livestck) {
		livestockDAO.saveLivestock(livestck);
	}

	@Override
	public void updateLivestock(livestock livestck) {
		livestockDAO.updateLivestock(livestck);
	}

	@Override
	public void deleteLivestock(int livestockId) {
		livestockDAO.deleteLivestock(livestockId);
	}

	@Override
	public livestock getLivestockById(int livestockId) {
		return livestockDAO.getLivestockById(livestockId);
	}
}
