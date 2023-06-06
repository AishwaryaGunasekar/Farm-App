package com.solvd.farmapp.model;

public class livestock {

	private int livestock_id;
	private String livestock_type;
	private String livestock_breed;
	private String livestock_quantity;

	public livestock() {
		super();
	}

	public livestock(int livestock_id, String livestock_type, String livestock_breed, String livestock_quantity) {
		super();
		this.livestock_id = livestock_id;
		this.livestock_type = livestock_type;
		this.livestock_breed = livestock_breed;
		this.livestock_quantity = livestock_quantity;
	}

	public int getLivestock_id() {
		return livestock_id;
	}

	public void setLivestock_id(int livestock_id) {
		this.livestock_id = livestock_id;
	}

	public String getLivestock_type() {
		return livestock_type;
	}

	public void setLivestock_type(String livestock_type) {
		this.livestock_type = livestock_type;
	}

	public String getLivestock_breed() {
		return livestock_breed;
	}

	public void setLivestock_breed(String livestock_breed) {
		this.livestock_breed = livestock_breed;
	}

	public String getLivestock_quantity() {
		return livestock_quantity;
	}

	public void setLivestock_quantity(String livestock_quantity) {
		this.livestock_quantity = livestock_quantity;
	}

	@Override
	public String toString() {
		return "livestock [livestock_id=" + livestock_id + ", livestock_type=" + livestock_type + ", livestock_breed="
				+ livestock_breed + ", livestock_quantity=" + livestock_quantity + "]";
	}

}
