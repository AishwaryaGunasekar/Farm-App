package com.solvd.farmapp.dao;

import java.util.List;

import com.solvd.farmapp.bin.Expenses;

public interface IExpensesDAO {
	Expenses getById(int id);

	List<Expenses> getAll();

	void save(Expenses expenses);

	void update(Expenses expenses);

	void delete(Expenses expenses);
}
