package com.solvd.farmapp.dao;


import java.util.List;

import com.solvd.farmapp.bin.Harvests;

public interface IHarvestsDAO {
	Harvests getHarvestById(int harvestId);
    List<Harvests> getAllHarvests();
    void saveHarvest(Harvests harvest);
    void updateHarvest(Harvests harvest);
    void deleteHarvest(int harvestId);
}
