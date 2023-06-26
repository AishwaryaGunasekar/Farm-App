package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "employeefields")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "employeefields")
public class EmployeeFields {

	@JsonProperty(value = "employeeid")
	@XmlAttribute
	private int employeeId;
	@JsonProperty(value = "fieldid")
	@XmlAttribute
	private int fieldId;
	private String startDate;
	private String endDate;

	public EmployeeFields(int employeeId, int fieldId, String startDate, String endDate) {
		super();
		this.employeeId = employeeId;
		this.fieldId = fieldId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public EmployeeFields() {

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "EmployeeFields [employeeId=" + employeeId + ", fieldId=" + fieldId + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

}
