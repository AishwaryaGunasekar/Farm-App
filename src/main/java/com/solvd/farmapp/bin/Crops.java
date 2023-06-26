package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "crops")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "crops")
public class Crops {

	@JsonProperty(value = "cropid")
	@XmlAttribute
	private int cropId;
	@JsonProperty(value = "cropname")
	@XmlAttribute
	private String cropName;
	@JsonProperty(value = "croptype")
	@XmlAttribute
	private String cropType;
	@JsonProperty(value = "cropyield")
	@XmlAttribute
	private int cropYield;

	public Crops(int cropId, String cropName, String cropType, int cropYield) {
		super();
		this.cropId = cropId;
		this.cropName = cropName;
		this.cropType = cropType;
		this.cropYield = cropYield;
	}

	public Crops() {

	}

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public int getCropYield() {
		return cropYield;
	}

	public void setCropYield(int cropYield) {
		this.cropYield = cropYield;
	}

	@Override
	public String toString() {
		return "Crops [cropId=" + cropId + ", cropName=" + cropName + ", cropType=" + cropType + ", cropYield="
				+ cropYield + "]";
	}

}
