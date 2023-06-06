package com.solvd.farmapp.model;

public class crops {

	private int crop_id;
	private String crop_name;
	private String crop_type;
	private int crop_yield;

	public crops() {
super();

	}

	public crops(int crop_id, String crop_name, String crop_type, int crop_yield) {
		super();
		this.crop_id = crop_id;
		this.crop_name = crop_name;
		this.crop_type = crop_type;
		this.crop_yield = crop_yield;
	}

	public int getCrop_id() {
		return crop_id;
	}

	public void setCrop_id(int crop_id) {
		this.crop_id = crop_id;
	}

	public String getCrop_name() {
		return crop_name;
	}

	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}

	public String getCrop_type() {
		return crop_type;
	}

	public void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}

	public int getCrop_yield() {
		return crop_yield;
	}

	public void setCrop_yield(int crop_yield) {
		this.crop_yield = crop_yield;
	}

	@Override
	public String toString() {
		return "crops [crop_id=" + crop_id + ", crop_name=" + crop_name + ", crop_type=" + crop_type + ", crop_yield="
				+ crop_yield + "]";
	}

}
