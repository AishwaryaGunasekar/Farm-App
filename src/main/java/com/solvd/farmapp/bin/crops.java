package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;



@JsonRootName(value = "crops")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlRootElement (name = "crops")
public class crops {

	@JsonProperty(value = "crop_id")
	private int crop_id;
	@JsonProperty(value = "crop_name")
	private String crop_name;
	@JsonProperty(value = "crop_type")
	private String crop_type;
	@JsonProperty(value = "crop_yield")
	private int crop_yield;

	public crops() {
		super();

	}

	public crops(int crop_id, String crop_name, String crop_type, int crop_yield) {
		super();
		this.crop_id = crop_id;
		this.crop_name = crop_name;
		this.crop_type = crop_type;
		this.crop_yield = crop_yield;
	}

	public int getCrop_id() {
		return crop_id;
	}

	public void setCrop_id(int crop_id) {
		this.crop_id = crop_id;
	}

	public String getCrop_name() {
		return crop_name;
	}

	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}

	public String getCrop_type() {
		return crop_type;
	}

	public void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}

	public int getCrop_yield() {
		return crop_yield;
	}

	public void setCrop_yield(int crop_yield) {
		this.crop_yield = crop_yield;
	}

	@Override
	public String toString() {
		return "crops [crop_id=" + crop_id + ", crop_name=" + crop_name + ", crop_type=" + crop_type + ", crop_yield="
				+ crop_yield + "]";
	}

}
