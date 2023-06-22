package com.solvd.farmapp.dao;

import java.util.List;

import com.solvd.farmapp.bin.Sales;

public interface ISalesDAO {

	void getById(int id);

	List<Sales> getAll();

	void save(Sales sale);

	void update(Sales sale);

	void delete(Sales sale);
}
