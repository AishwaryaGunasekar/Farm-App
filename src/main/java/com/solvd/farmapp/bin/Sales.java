package com.solvd.farmapp.bin;

import java.util.Date;

public class Sales {

	private int sale_id;
	private int crop_id;
	private Date sale_date;
	private int sale_quantity;
	private int sale_price;

	public Sales(int sale_id, int crop_id, Date sale_date, int sale_quantity, int sale_price) {
		super();
		this.sale_id = sale_id;
		this.crop_id = crop_id;
		this.sale_date = sale_date;
		this.sale_quantity = sale_quantity;
		this.sale_price = sale_price;
	}

	public Sales() {
		super();
	}

	public int getSale_id() {
		return sale_id;
	}

	public void setSale_id(int sale_id) {
		this.sale_id = sale_id;
	}

	public int getCrop_id() {
		return crop_id;
	}

	public void setCrop_id(int crop_id) {
		this.crop_id = crop_id;
	}

	public Date getSale_date() {
		return sale_date;
	}

	public void setSale_date(Date sale_date) {
		this.sale_date = sale_date;
	}

	public int getSale_quantity() {
		return sale_quantity;
	}

	public void setSale_quantity(int sale_quantity) {
		this.sale_quantity = sale_quantity;
	}

	public int getSale_price() {
		return sale_price;
	}

	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}

	@Override
	public String toString() {
		return "Sales [sale_id=" + sale_id + ", crop_id=" + crop_id + ", sale_date=" + sale_date + ", sale_quantity="
				+ sale_quantity + ", sale_price=" + sale_price + "]";
	}

}
