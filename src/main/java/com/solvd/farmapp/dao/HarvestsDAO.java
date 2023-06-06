package com.solvd.farmapp.dao;


import com.solvd.farmapp.model.harvests;

import java.util.List;

public interface HarvestsDAO {
    harvests getHarvestById(int harvestId);
    List<harvests> getAllHarvests();
    void saveHarvest(harvests harvest);
    void updateHarvest(harvests harvest);
    void deleteHarvest(int harvestId);
}
