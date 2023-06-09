package com.solvd.farmapp.bin;

import java.util.Date;

public class field_Crops {

	private int field_id;
	private int crop_id;
	private Date planting_date;
	private Date harvest_date;

	public field_Crops() {
		super();
	}

	public field_Crops(int field_id, int crop_id, Date planting_date, Date harvest_date) {
		super();
		this.field_id = field_id;
		this.crop_id = crop_id;
		this.planting_date = planting_date;
		this.harvest_date = harvest_date;
	}

	public int getField_id() {
		return field_id;
	}

	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

	public int getCrop_id() {
		return crop_id;
	}

	public void setCrop_id(int crop_id) {
		this.crop_id = crop_id;
	}

	public Date getPlanting_date() {
		return planting_date;
	}

	public void setPlanting_date(Date planting_date) {
		this.planting_date = planting_date;
	}

	public Date getHarvest_date() {
		return harvest_date;
	}

	public void setHarvest_date(Date harvest_date) {
		this.harvest_date = harvest_date;
	}

	@Override
	public String toString() {
		return "field_Crops [field_id=" + field_id + ", crop_id=" + crop_id + ", planting_date=" + planting_date
				+ ", harvest_date=" + harvest_date + "]";
	}

}
