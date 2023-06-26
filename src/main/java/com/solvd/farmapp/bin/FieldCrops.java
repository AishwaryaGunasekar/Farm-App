package com.solvd.farmapp.bin;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "fieldCrops")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "fieldCrops")
public class FieldCrops {

	@JsonProperty(value = "fieldId")
	@XmlAttribute
	private int fieldId;
	@JsonProperty(value = "cropId")
	@XmlAttribute
	private int cropId;
	private Date plantingDate;
	private Date harvestDate;

	public FieldCrops(int fieldId, int cropId, Date plantingDate, Date harvestDate) {
		super();
		this.fieldId = fieldId;
		this.cropId = cropId;
		this.plantingDate = plantingDate;
		this.harvestDate = harvestDate;
	}

	public FieldCrops() {
		super();
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

	public Date getPlantingDate() {
		return plantingDate;
	}

	public void setPlantingDate(Date plantingDate) {
		this.plantingDate = plantingDate;
	}

	public Date getHarvestDate() {
		return harvestDate;
	}

	public void setHarvestDate(Date harvestDate) {
		this.harvestDate = harvestDate;
	}

	@Override
	public String toString() {
		return "FieldCrops [fieldId=" + fieldId + ", cropId=" + cropId + ", plantingDate=" + plantingDate
				+ ", harvestDate=" + harvestDate + "]";
	}

}
