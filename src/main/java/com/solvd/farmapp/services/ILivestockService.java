package com.solvd.farmapp.services;

import com.solvd.farmapp.bin.LiveStock;

public interface ILivestockService {
	void saveLivestock(LiveStock livestock);

	void updateLivestock(LiveStock livestock);

	void deleteLivestock(int livestockId);

	LiveStock getLivestockById(int livestockId);
}
