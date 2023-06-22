package com.solvd.farmapp.services.Impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.farmapp.bin.LiveStock;
import com.solvd.farmapp.dao.ILivestockDAO;
import com.solvd.farmapp.dao.Impl.LiveStockDAO;
import com.solvd.farmapp.services.ILivestockService;

public class LiveStockService implements ILivestockService {

	private final static Logger LOGGER = LogManager.getLogger(LiveStockService.class);

	private ILivestockDAO livestockDAO;

	public LiveStockService() {
		livestockDAO = new LiveStockDAO();
	}

	@Override
	public void saveLivestock(LiveStock livestck) {
		if (livestck != null) {
			ILivestockDAO livestockDAO = new LiveStockDAO();
			livestockDAO.saveLivestock(livestck);
		} else {
			LOGGER.error("livestock object is NULL.");
			throw new NullPointerException();
		}
	}

	@Override
	public void updateLivestock(LiveStock livestck) {
		if (livestck != null) {
			ILivestockDAO livestockDAO = new LiveStockDAO();
			livestockDAO.updateLivestock(livestck);
		} else {
			LOGGER.error("livestock object is NULL.");
			throw new NullPointerException();
		}
	}

	@Override
	public void deleteLivestock(int livestockId) {
		if (livestockId > 0) {
			ILivestockDAO livestockDAO = new LiveStockDAO();
			livestockDAO.deleteLivestock(livestockId);
		} else {
			LOGGER.error("livestock object is NULL.");
			throw new NullPointerException();
		}
	}

	@Override
	public LiveStock getLivestockById(int livestockId) {
		return livestockDAO.getLivestockById(livestockId);
	}
}
