package com.solvd.farmapp.services;

import com.solvd.farmapp.bin.Sales;

public interface ISalesService {

	void saveSales(Sales sales);

	void updateSales(Sales sales);

	void deleteSales(int salesId);

	Sales getSalesById(int salesId);
}
