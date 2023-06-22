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

	@JsonProperty(value = "harvest_id")
	@XmlAttribute
	private int harvest_Id;

	@JsonProperty(value = "field_id")
	@XmlAttribute
	private int field_Id;

	@JsonProperty(value = "crop_id")
	@XmlAttribute
	private int crop_Id;
	private Date harvest_Date;

	@JsonProperty(value = "harvested_quantity")
	@XmlAttribute
	private int harvested_Quantity;

	public Harvests(int harvest_Id, int field_Id, int crop_Id, Date harvest_Date, int harvested_Quantity) {
		super();
		this.harvest_Id = harvest_Id;
		this.field_Id = field_Id;
		this.crop_Id = crop_Id;
		this.harvest_Date = harvest_Date;
		this.harvested_Quantity = harvested_Quantity;
	}

	public int getHarvest_Id() {
		return harvest_Id;
	}

	public void setHarvest_Id(int harvest_Id) {
		this.harvest_Id = harvest_Id;
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

	public Date getHarvest_Date() {
		return harvest_Date;
	}

	public void setHarvest_Date(Date harvest_Date) {
		this.harvest_Date = harvest_Date;
	}

	public int getHarvested_Quantity() {
		return harvested_Quantity;
	}

	public void setHarvested_Quantity(int harvested_Quantity) {
		this.harvested_Quantity = harvested_Quantity;
	}

	@Override
	public String toString() {
		return "Harvests [harvest_Id=" + harvest_Id + ", field_Id=" + field_Id + ", crop_Id=" + crop_Id
				+ ", harvest_Date=" + harvest_Date + ", harvested_Quantity=" + harvested_Quantity + "]";
	}

}
