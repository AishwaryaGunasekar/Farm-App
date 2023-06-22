package com.solvd.farmapp.dao;

import java.util.List;

import com.solvd.farmapp.bin.Crops;

public interface ICropsDAO {
	void getById(int id);
	

	List<Crops> getAll();

	void save(Crops crop);

	void update(Crops crop);

	void delete(Crops crop);
}
