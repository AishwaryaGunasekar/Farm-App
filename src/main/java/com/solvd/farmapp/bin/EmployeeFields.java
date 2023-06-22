package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "employee_fields")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "employee_fields")
public class EmployeeFields {

	@JsonProperty(value = "employee_id")
	@XmlAttribute
	private int employee_Id;
	@JsonProperty(value = "field_id")
	@XmlAttribute
	private int field_Id;
	private String start_Date;
	private String end_Date;

	public EmployeeFields(int employee_Id, int field_Id, String start_Date, String end_Date) {
		super();
		this.employee_Id = employee_Id;
		this.field_Id = field_Id;
		this.start_Date = start_Date;
		this.end_Date = end_Date;
	}

	public int getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	public int getField_Id() {
		return field_Id;
	}

	public void setField_Id(int field_Id) {
		this.field_Id = field_Id;
	}

	public String getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(String start_Date) {
		this.start_Date = start_Date;
	}

	public String getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(String end_Date) {
		this.end_Date = end_Date;
	}

	@Override
	public String toString() {
		return "EmployeeFields [employee_Id=" + employee_Id + ", field_Id=" + field_Id + ", start_Date=" + start_Date
				+ ", end_Date=" + end_Date + "]";
	}

	
}
