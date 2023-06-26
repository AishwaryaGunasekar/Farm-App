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

	@JsonProperty(value = "livestockId")
	@XmlAttribute
	private int livestockId;

	@JsonProperty(value = "livestockType")
	@XmlAttribute
	private String livestockType;

	@JsonProperty(value = "livestockBreed")
	@XmlAttribute
	private String livestockBreed;

	@JsonProperty(value = "livestockQuantity")
	@XmlAttribute
	private String livestockQuantity;

	public LiveStock(int livestockId, String livestockType, String livestockBreed, String livestockQuantity) {
		super();
		this.livestockId = livestockId;
		this.livestockType = livestockType;
		this.livestockBreed = livestockBreed;
		this.livestockQuantity = livestockQuantity;
	}

	public LiveStock() {

	}

	public int getLivestockId() {
		return livestockId;
	}

	public void setLivestockId(int livestockId) {
		this.livestockId = livestockId;
	}

	public String getLivestockType() {
		return livestockType;
	}

	public void setLivestockType(String livestockType) {
		this.livestockType = livestockType;
	}

	public String getLivestockBreed() {
		return livestockBreed;
	}

	public void setLivestockBreed(String livestockBreed) {
		this.livestockBreed = livestockBreed;
	}

	public String getLivestockQuantity() {
		return livestockQuantity;
	}

	public void setLivestockQuantity(String livestockQuantity) {
		this.livestockQuantity = livestockQuantity;
	}

	@Override
	public String toString() {
		return "LiveStock [livestockId=" + livestockId + ", livestockType=" + livestockType + ", livestockBreed="
				+ livestockBreed + ", livestockQuantity=" + livestockQuantity + "]";
	}

}
