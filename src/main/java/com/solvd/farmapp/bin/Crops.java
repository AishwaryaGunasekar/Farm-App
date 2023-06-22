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

	@JsonProperty(value = "crop_id")
	@XmlAttribute
	private int crop_Id;
	@JsonProperty(value = "crop_name")
	@XmlAttribute
	private String crop_Name;
	@JsonProperty(value = "crop_type")
	@XmlAttribute
	private String crop_Type;
	@JsonProperty(value = "crop_yield")
	@XmlAttribute
	private int crop_Yield;

	public Crops(int crop_Id, String crop_Name, String crop_Type, int crop_Yield) {
		super();
		this.crop_Id = crop_Id;
		this.crop_Name = crop_Name;
		this.crop_Type = crop_Type;
		this.crop_Yield = crop_Yield;
	}

	public Crops() {
		super();

	}

	public int getCrop_Id() {
		return crop_Id;
	}

	public void setCrop_Id(int crop_Id) {
		this.crop_Id = crop_Id;
	}

	public String getCrop_Name() {
		return crop_Name;
	}

	public void setCrop_Name(String crop_Name) {
		this.crop_Name = crop_Name;
	}

	public String getCrop_Type() {
		return crop_Type;
	}

	public void setCrop_Type(String crop_Type) {
		this.crop_Type = crop_Type;
	}

	public int getCrop_Yield() {
		return crop_Yield;
	}

	public void setCrop_Yield(int crop_Yield) {
		this.crop_Yield = crop_Yield;
	}

	@Override
	public String toString() {
		return "Crops [crop_Id=" + crop_Id + ", crop_Name=" + crop_Name + ", crop_Type=" + crop_Type + ", crop_Yield="
				+ crop_Yield + "]";
	}

}
