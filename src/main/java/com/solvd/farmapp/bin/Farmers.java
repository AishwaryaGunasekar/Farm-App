package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "farmers")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "farmers")
public class Farmers {

	@JsonProperty(value = "farmer_id")
	@XmlAttribute
	private int farmer_Id;
	@JsonProperty(value = "farmer_name")
	@XmlAttribute
	private String farmer_Name;
	@JsonProperty(value = "farmer_address")
	@XmlAttribute
	private String farmer_Address;
	@JsonProperty(value = "farmer_phone")
	@XmlAttribute
	private int farmer_Phone;

	public Farmers() {
		super();
	}

	public Farmers(int farmer_Id, String farmer_Name, String farmer_Address, int farmer_Phone) {
		super();
		this.farmer_Id = farmer_Id;
		this.farmer_Name = farmer_Name;
		this.farmer_Address = farmer_Address;
		this.farmer_Phone = farmer_Phone;
	}

	public int getFarmer_Id() {
		return farmer_Id;
	}

	public void setFarmer_Id(int farmer_Id) {
		this.farmer_Id = farmer_Id;
	}

	public String getFarmer_Name() {
		return farmer_Name;
	}

	public void setFarmer_Name(String farmer_Name) {
		this.farmer_Name = farmer_Name;
	}

	public String getFarmer_Address() {
		return farmer_Address;
	}

	public void setFarmer_Address(String farmer_Address) {
		this.farmer_Address = farmer_Address;
	}

	public int getFarmer_Phone() {
		return farmer_Phone;
	}

	public void setFarmer_Phone(int farmer_Phone) {
		this.farmer_Phone = farmer_Phone;
	}

	@Override
	public String toString() {
		return "Farmers [farmer_Id=" + farmer_Id + ", farmer_Name=" + farmer_Name + ", farmer_Address=" + farmer_Address
				+ ", farmer_Phone=" + farmer_Phone + "]";
	}

}
