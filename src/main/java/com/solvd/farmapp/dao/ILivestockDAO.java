package com.solvd.farmapp.dao;

import com.solvd.farmapp.bin.LiveStock;

public interface ILivestockDAO {
	void saveLivestock(LiveStock livestck);

	void updateLivestock(LiveStock livestck);

	void deleteLivestock(int livestockId);

	LiveStock getLivestockById(int livestockId);
}
