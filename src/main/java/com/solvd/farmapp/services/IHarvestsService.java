package com.solvd.farmapp.services;

import java.util.List;

import com.solvd.farmapp.bin.harvests;

public interface IHarvestsService {
    harvests getHarvestById(int harvestId);
    List<harvests> getAllHarvests();
    void saveHarvest(harvests harvest);
    void updateHarvest(harvests harvest);
    void deleteHarvest(int harvestId);
}
