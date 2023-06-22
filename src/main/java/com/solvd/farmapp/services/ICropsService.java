package com.solvd.farmapp.services;

import java.util.List;

import com.solvd.farmapp.bin.Crops;

public interface ICropsService {
	Crops getCropsById(int id);

	List<Crops> getAllCrops();

	void saveCrops(Crops crop);

	void updateCrops(Crops crop);

	void deleteCrops(Crops crop);

}
