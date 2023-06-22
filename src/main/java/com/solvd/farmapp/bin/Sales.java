package com.solvd.farmapp.bin;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "sales")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sales")
public class Sales {

	@JsonProperty(value = "sale_id")
	@XmlAttribute
	private int sale_Id;
	@JsonProperty(value = "crop_id")
	@XmlAttribute
	private int crop_Id;
	private Date sale_Date;
	@JsonProperty(value = "sale_quantity")
	@XmlAttribute
	private int sale_Quantity;
	@JsonProperty(value = "sale_price")
	@XmlAttribute
	private int sale_Price;

	public Sales(int sale_Id, int crop_Id, Date sale_Date, int sale_Quantity, int sale_Price) {
		super();
		this.sale_Id = sale_Id;
		this.crop_Id = crop_Id;
		this.sale_Date = sale_Date;
		this.sale_Quantity = sale_Quantity;
		this.sale_Price = sale_Price;
	}

	public Sales() {
		
		
	}

	public int getSale_Id() {
		return sale_Id;
	}

	public void setSale_Id(int sale_Id) {
		this.sale_Id = sale_Id;
	}

	public int getCrop_Id() {
		return crop_Id;
	}

	public void setCrop_Id(int crop_Id) {
		this.crop_Id = crop_Id;
	}

	public Date getSale_Date() {
		return sale_Date;
	}

	public void setSale_Date(Date sale_Date) {
		this.sale_Date = sale_Date;
	}

	public int getSale_Quantity() {
		return sale_Quantity;
	}

	public void setSale_Quantity(int sale_Quantity) {
		this.sale_Quantity = sale_Quantity;
	}

	public int getSale_Price() {
		return sale_Price;
	}

	public void setSale_Price(int sale_Price) {
		this.sale_Price = sale_Price;
	}

	@Override
	public String toString() {
		return "Sales [sale_Id=" + sale_Id + ", crop_Id=" + crop_Id + ", sale_Date=" + sale_Date + ", sale_Quantity="
				+ sale_Quantity + ", sale_Price=" + sale_Price + "]";
	}

}
