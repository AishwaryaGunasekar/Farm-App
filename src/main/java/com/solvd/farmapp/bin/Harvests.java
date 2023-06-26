package com.solvd.farmapp.bin;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "harvests")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "harvests")
public class Harvests {

	@JsonProperty(value = "harvestid")
	@XmlAttribute
	private int harvestId;

	@JsonProperty(value = "fieldid")
	@XmlAttribute
	private int fieldId;

	@JsonProperty(value = "cropid")
	@XmlAttribute
	private int cropId;
	private Date harvestDate;

	@JsonProperty(value = "harvestedquantity")
	@XmlAttribute
	private int harvestedQuantity;

	public Harvests(int harvestId, int fieldId, int cropId, Date harvestDate, int harvestedQuantity) {
		super();
		this.harvestId = harvestId;
		this.fieldId = fieldId;
		this.cropId = cropId;
		this.harvestDate = harvestDate;
		this.harvestedQuantity = harvestedQuantity;
	}

	public Harvests() {

	}

	public int getHarvestId() {
		return harvestId;
	}

	public void setHarvestId(int harvestId) {
		this.harvestId = harvestId;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public Date getHarvestDate() {
		return harvestDate;
	}

	public void setHarvestDate(Date harvestDate) {
		this.harvestDate = harvestDate;
	}

	public int getHarvestedQuantity() {
		return harvestedQuantity;
	}

	public void setHarvestedQuantity(int harvestedQuantity) {
		this.harvestedQuantity = harvestedQuantity;
	}

	@Override
	public String toString() {
		return "Harvests [harvestId=" + harvestId + ", fieldId=" + fieldId + ", cropId=" + cropId + ", harvestDate="
				+ harvestDate + ", harvestedQuantity=" + harvestedQuantity + "]";
	}

}
