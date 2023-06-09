package com.solvd.farmapp.services;

	import java.util.List;

import com.solvd.farmapp.bin.crops;

	public interface ICropsService {
	    crops getCropsById(int id);
	    List<crops> getAllCrops();
	    void saveCrops(crops crop);
	    void updateCrops(crops crop);
	    void deleteCrops(crops crop);
	}

