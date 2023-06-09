package com.solvd.farmapp.services;

import java.util.List;

import com.solvd.farmapp.bin.farmers;
import com.solvd.farmapp.dao.farmersDAO;

public class farmersService {

	public List<farmers> findAllFarmers() {
		farmersDAO fdao = farmersDAO.getInstance();
		return fdao.findAllFarmers();
	}
}
