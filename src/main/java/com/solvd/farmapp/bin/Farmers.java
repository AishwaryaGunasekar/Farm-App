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

	@JsonProperty(value = "farmerid")
	@XmlAttribute
	private int farmerId;
	@JsonProperty(value = "farmername")
	@XmlAttribute
	private String farmerName;
	@JsonProperty(value = "farmeraddress")
	@XmlAttribute
	private String farmerAddress;
	@JsonProperty(value = "farmerphone")
	@XmlAttribute
	private int farmerPhone;

	public Farmers(int farmerId, String farmerName, String farmerAddress, int farmerPhone) {
		super();
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.farmerAddress = farmerAddress;
		this.farmerPhone = farmerPhone;
	}

	public Farmers() {
		super();
	}

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getFarmerAddress() {
		return farmerAddress;
	}

	public void setFarmerAddress(String farmerAddress) {
		this.farmerAddress = farmerAddress;
	}

	public int getFarmerPhone() {
		return farmerPhone;
	}

	public void setFarmerPhone(int farmerPhone) {
		this.farmerPhone = farmerPhone;
	}

	@Override
	public String toString() {
		return "Farmers [farmerId=" + farmerId + ", farmerName=" + farmerName + ", farmerAddress=" + farmerAddress
				+ ", farmerPhone=" + farmerPhone + "]";
	}

}
