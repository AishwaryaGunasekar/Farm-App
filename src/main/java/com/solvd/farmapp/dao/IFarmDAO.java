package com.solvd.farmapp.dao;

import java.util.List;

import com.solvd.farmapp.bin.Farm;

public interface IFarmDAO {
    void getById(int id);
    List<Farm> getAll();
    void save(Farm farm);
    void update(Farm farm);
    void delete(Farm farm);
}
