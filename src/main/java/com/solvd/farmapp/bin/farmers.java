package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "farmers")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "farmers")
public class farmers {

	@JsonProperty(value = "farmer_id")
	private int farmer_id;
	@JsonProperty(value = "farmer_name")
	private String farmer_name;
	@JsonProperty(value = "farmer_address")
	private String farmer_address;
	@JsonProperty(value = "farmer_phone")
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
