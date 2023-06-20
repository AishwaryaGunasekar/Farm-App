package com.solvd.farmapp.bin;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName(value = "harvests")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "harvests")
public class harvests {


	@JsonProperty(value = "harvest_id")
	private int harvest_id;

	@JsonProperty(value = "field_id")
	private int field_id;

	@JsonProperty(value = "crop_id")
	private int crop_id;
	private Date harvest_date;

	@JsonProperty(value = "harvested_quantity")
	private int harvested_quantity;

	public harvests(int harvest_id, int field_id, int crop_id, Date harvest_date, int harvested_quantity) {
		super();
		this.harvest_id = harvest_id;
		this.field_id = field_id;
		this.crop_id = crop_id;
		this.harvest_date = harvest_date;
		this.harvested_quantity = harvested_quantity;
	}

	public harvests() {
		super();
	}

	public int getHarvest_id() {
		return harvest_id;
	}

	public void setHarvest_id(int harvest_id) {
		this.harvest_id = harvest_id;
	}

	public int getField_id() {
		return field_id;
	}

	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

	public int getCrop_id() {
		return crop_id;
	}

	public void setCrop_id(int crop_id) {
		this.crop_id = crop_id;
	}

	public Date getHarvest_date() {
		return harvest_date;
	}

	public void setHarvest_date(Date harvest_date) {
		this.harvest_date = harvest_date;
	}

	public int getHarvested_quantity() {
		return harvested_quantity;
	}

	public void setHarvested_quantity(int harvested_quantity) {
		this.harvested_quantity = harvested_quantity;
	}

	@Override
	public String toString() {
		return "harvests [harvest_id=" + harvest_id + ", field_id=" + field_id + ", crop_id=" + crop_id
				+ ", harvest_date=" + harvest_date + ", harvested_quantity=" + harvested_quantity + "]";
	}

}
