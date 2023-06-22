package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "livestock")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "livestock")
public class LiveStock {

	@JsonProperty(value = "livestock_Id")
	@XmlAttribute
	private int livestock_Id;

	@JsonProperty(value = "livestock_Type")
	@XmlAttribute
	private String livestock_Type;

	@JsonProperty(value = "livestock_Type")
	@XmlAttribute
	private String livestock_Breed;

	@JsonProperty(value = "livestock_Quantity")
	@XmlAttribute
	private String livestock_Quantity;

	public LiveStock(int livestock_Id, String livestock_Type, String livestock_Breed, String livestock_Quantity) {
		super();
		this.livestock_Id = livestock_Id;
		this.livestock_Type = livestock_Type;
		this.livestock_Breed = livestock_Breed;
		this.livestock_Quantity = livestock_Quantity;
	}

	public LiveStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLivestock_Id() {
		return livestock_Id;
	}

	public void setLivestock_Id(int livestock_Id) {
		this.livestock_Id = livestock_Id;
	}

	public String getLivestock_Type() {
		return livestock_Type;
	}

	public void setLivestock_Type(String livestock_Type) {
		this.livestock_Type = livestock_Type;
	}

	public String getLivestock_Breed() {
		return livestock_Breed;
	}

	public void setLivestock_Breed(String livestock_Breed) {
		this.livestock_Breed = livestock_Breed;
	}

	public String getLivestock_Quantity() {
		return livestock_Quantity;
	}

	public void setLivestock_Quantity(String livestock_Quantity) {
		this.livestock_Quantity = livestock_Quantity;
	}

	@Override
	public String toString() {
		return "LiveStock [livestock_Id=" + livestock_Id + ", livestock_Type=" + livestock_Type + ", livestock_Breed="
				+ livestock_Breed + ", livestock_Quantity=" + livestock_Quantity + "]";
	}
	

}
