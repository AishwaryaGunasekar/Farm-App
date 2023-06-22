package com.solvd.farmapp.dao;

import java.util.List;

import com.solvd.farmapp.bin.Farmers;



public interface IFarmersDAO {
	void getById(int id);

	List<Farmers> getAll();

	void save(Farmers farmers);

	void update(Farmers farmers);

	void delete(Farmers farmers);
}
