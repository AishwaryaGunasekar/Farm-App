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

	@JsonProperty(value = "saleid")
	@XmlAttribute
	private int saleId;
	@JsonProperty(value = "cropid")
	@XmlAttribute
	private int cropId;
	private Date saleDate;
	@JsonProperty(value = "salequantity")
	@XmlAttribute
	private int saleQuantity;
	@JsonProperty(value = "saleprice")
	@XmlAttribute
	private int salePrice;

	public Sales(int saleId, int cropId, Date saleDate, int saleQuantity, int salePrice) {
		super();
		this.saleId = saleId;
		this.cropId = cropId;
		this.saleDate = saleDate;
		this.saleQuantity = saleQuantity;
		this.salePrice = salePrice;
	}

	public Sales() {

	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public int getSaleQuantity() {
		return saleQuantity;
	}

	public void setSaleQuantity(int saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	@Override
	public String toString() {
		return "Sales [saleId=" + saleId + ", cropId=" + cropId + ", saleDate=" + saleDate + ", saleQuantity="
				+ saleQuantity + ", salePrice=" + salePrice + "]";
	}

}
