package com.solvd.farmapp.dao;

import com.solvd.farmapp.model.livestock;

public interface LivestockDAO {
	void saveLivestock(livestock livestck);

	void updateLivestock(livestock livestck);

	void deleteLivestock(int livestockId);

	livestock getLivestockById(int livestockId);
}
