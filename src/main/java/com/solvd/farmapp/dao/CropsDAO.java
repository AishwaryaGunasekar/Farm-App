package com.solvd.farmapp.dao;

import java.util.List;

import com.solvd.farmapp.model.crops;

public interface CropsDAO {
	crops getById(int id);

	List<crops> getAll();

	void save(crops crop);

	void update(crops crop);

	void delete(crops crop);
}
