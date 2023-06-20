package com.solvd.farmapp.dao.Impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.solvd.farmapp.bin.harvests;
import com.solvd.farmapp.dao.IHarvestsDAO;

public class HarvestsDAO implements IHarvestsDAO {

    // Simulating a database with a map
    private Map<Integer, harvests> harvestsMap;

    public HarvestsDAO() {
        harvestsMap = new HashMap<>();
    }

    @Override
    public harvests getHarvestById(int harvestId) {
        return harvestsMap.get(harvestId);
    }

    @Override
    public List<harvests> getAllHarvests() {
        return new ArrayList<>(harvestsMap.values());
    }

    @Override
    public void saveHarvest(harvests harvest) {
        harvestsMap.put(harvest.getHarvest_id(), harvest);
    }

    @Override
    public void updateHarvest(harvests harvest) {
        harvestsMap.put(harvest.getHarvest_id(), harvest);
    }

    @Override
    public void deleteHarvest(int harvestId) {
        harvestsMap.remove(harvestId);
    }
}

