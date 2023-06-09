package com.solvd.farmapp.services;

import com.solvd.farmapp.bin.livestock;

public interface ILivestockService {
    void saveLivestock(livestock livestock);
    void updateLivestock(livestock livestock);
    void deleteLivestock(int livestockId);
    livestock getLivestockById(int livestockId);
}
