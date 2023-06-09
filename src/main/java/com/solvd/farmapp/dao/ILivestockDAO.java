package com.solvd.farmapp.dao;

import com.solvd.farmapp.bin.livestock;

public interface ILivestockDAO {
	void saveLivestock(livestock livestck);

	void updateLivestock(livestock livestck);

	void deleteLivestock(int livestockId);

	livestock getLivestockById(int livestockId);
}
