package com.solvd.farmapp.services;

import java.util.List;

import com.solvd.farmapp.bin.Farm;

public interface IFarmService {
	Farm getFarmById(int id);

	List<Farm> getAllFarms();

	void saveFarm(Farm farm);

	void updateFarm(Farm farm);

	void deleteFarm(Farm farm);
}
