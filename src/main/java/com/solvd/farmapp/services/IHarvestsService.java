package com.solvd.farmapp.services;

import java.util.List;

import com.solvd.farmapp.bin.Harvests;

public interface IHarvestsService {
    Harvests getHarvestById(int harvestId);
    List<Harvests> getAllHarvests();
    void saveHarvest(Harvests harvest);
    void updateHarvest(Harvests harvest);
    void deleteHarvest(int harvestId);
}
