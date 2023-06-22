package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "fileds")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "fileds")
public class Fileds {

	@JsonProperty(value = "field_id")
	@XmlAttribute
	private int field_Id;
	@JsonProperty(value = "field_name")
	@XmlAttribute
	private String field_Name;
	@JsonProperty(value = "field_area")
	@XmlAttribute
	private String field_Area;

	public Fileds(int field_Id, String field_Name, String field_Area) {
		super();
		this.field_Id = field_Id;
		this.field_Name = field_Name;
		this.field_Area = field_Area;
	}

	public Fileds() {
		super();
	}

	public int getField_Id() {
		return field_Id;
	}

	public void setField_Id(int field_Id) {
		this.field_Id = field_Id;
	}

	public String getField_Name() {
		return field_Name;
	}

	public void setField_Name(String field_Name) {
		this.field_Name = field_Name;
	}

	public String getField_Area() {
		return field_Area;
	}

	public void setField_Area(String field_Area) {
		this.field_Area = field_Area;
	}

	@Override
	public String toString() {
		return "Fileds [field_Id=" + field_Id + ", field_Name=" + field_Name + ", field_Area=" + field_Area + "]";
	}

}
