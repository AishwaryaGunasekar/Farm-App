package com.solvd.farmapp.bin;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "field_Crops")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "field_Crops")
public class FieldCrops {

	@JsonProperty(value = "field_Id")
	@XmlAttribute
	private int field_Id;
	@JsonProperty(value = "crop_Id")
	@XmlAttribute
	private int crop_Id;
	private Date planting_Date;
	private Date harvest_Date;

	public FieldCrops() {
		super();
	}

	public FieldCrops(int field_Id, int crop_Id, Date planting_Date, Date harvest_Date) {
		super();
		this.field_Id = field_Id;
		this.crop_Id = crop_Id;
		this.planting_Date = planting_Date;
		this.harvest_Date = harvest_Date;
	}

	public int getField_Id() {
		return field_Id;
	}

	public void setField_Id(int field_Id) {
		this.field_Id = field_Id;
	}

	public int getCrop_Id() {
		return crop_Id;
	}

	public void setCrop_Id(int crop_Id) {
		this.crop_Id = crop_Id;
	}

	public Date getPlanting_Date() {
		return planting_Date;
	}

	public void setPlanting_Date(Date planting_Date) {
		this.planting_Date = planting_Date;
	}

	public Date getHarvest_Date() {
		return harvest_Date;
	}

	public void setHarvest_Date(Date harvest_Date) {
		this.harvest_Date = harvest_Date;
	}

	@Override
	public String toString() {
		return "FieldCrops [field_Id=" + field_Id + ", crop_Id=" + crop_Id + ", planting_Date=" + planting_Date
				+ ", harvest_Date=" + harvest_Date + "]";
	}

}
