package com.solvd.farmapp.model;

public class farmers {

	private int farmer_id;
	private String farmer_name;
	private String farmer_address;
	private int farmer_phone;

	public farmers() {
		super();
	}

	public farmers(int farmer_id, String farmer_name, String farmer_address, int farmer_phone) {
		super();
		this.farmer_id = farmer_id;
		this.farmer_name = farmer_name;
		this.farmer_address = farmer_address;
		this.farmer_phone = farmer_phone;
	}

	public int getFarmer_id() {
		return farmer_id;
	}

	public void setFarmer_id(int farmer_id) {
		this.farmer_id = farmer_id;
	}

	public String getFarmer_name() {
		return farmer_name;
	}

	public void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}

	public String getFarmer_address() {
		return farmer_address;
	}

	public void setFarmer_address(String farmer_address) {
		this.farmer_address = farmer_address;
	}

	public int getFarmer_phone() {
		return farmer_phone;
	}

	public void setFarmer_phone(int farmer_phone) {
		this.farmer_phone = farmer_phone;
	}

	@Override
	public String toString() {
		return "farmers [farmer_id=" + farmer_id + ", farmer_name=" + farmer_name + ", farmer_address=" + farmer_address
				+ ", farmer_phone=" + farmer_phone + "]";
	}

}
