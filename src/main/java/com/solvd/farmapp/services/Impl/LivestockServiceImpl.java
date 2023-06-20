package com.solvd.farmapp.services.Impl;

import com.solvd.farmapp.bin.livestock;
import com.solvd.farmapp.dao.ILivestockDAO;
import com.solvd.farmapp.dao.Impl.LivestockDAO;
import com.solvd.farmapp.services.ILivestockService;

public class LivestockServiceImpl implements ILivestockService {

	private ILivestockDAO livestockDAO;

	public LivestockServiceImpl() {
		livestockDAO = new LivestockDAO();
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
