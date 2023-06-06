package com.solvd.farmapp.services;

import com.solvd.farmapp.model.livestock;

public interface LivestockService {
    void saveLivestock(livestock livestock);
    void updateLivestock(livestock livestock);
    void deleteLivestock(int livestockId);
    livestock getLivestockById(int livestockId);
}
