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

	@JsonProperty(value = "fieldid")
	@XmlAttribute
	private int fieldId;
	@JsonProperty(value = "fieldname")
	@XmlAttribute
	private String fieldName;
	@JsonProperty(value = "fieldarea")
	@XmlAttribute
	private String fieldArea;

	public Fileds(int fieldId, String fieldName, String fieldArea) {
		super();
		this.fieldId = fieldId;
		this.fieldName = fieldName;
		this.fieldArea = fieldArea;
	}

	public Fileds() {

	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldArea() {
		return fieldArea;
	}

	public void setFieldArea(String fieldArea) {
		this.fieldArea = fieldArea;
	}

	@Override
	public String toString() {
		return "Fileds [fieldId=" + fieldId + ", fieldName=" + fieldName + ", fieldArea=" + fieldArea + "]";
	}

}
