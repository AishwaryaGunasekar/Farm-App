package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "fileds")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "fileds")
public class fileds {

	@JsonProperty(value = "field_id")
	private int field_id;
	@JsonProperty(value = "field_name")
	private String field_name;
	@JsonProperty(value = "field_area")
	private String field_area;

	public fileds(int field_id, String field_name, String field_area) {
		super();
		this.field_id = field_id;
		this.field_name = field_name;
		this.field_area = field_area;
	}

	public fileds() {
		super();
	}

	public int getField_id() {
		return field_id;
	}

	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	public String getField_area() {
		return field_area;
	}

	public void setField_area(String field_area) {
		this.field_area = field_area;
	}

	@Override
	public String toString() {
		return "fileds [field_id=" + field_id + ", field_name=" + field_name + ", field_area=" + field_area + "]";
	}

}
