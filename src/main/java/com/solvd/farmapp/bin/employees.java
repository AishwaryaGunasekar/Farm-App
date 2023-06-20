package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;



@JsonRootName(value = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "employees")
public class employees {

	@JsonProperty(value = "employee_id")
	private int employee_id;
	@JsonProperty(value = "employee_name")
	private String employee_name;
	@JsonProperty(value = "employee_role")
	private String employee_role;
	@JsonProperty(value = "employee_salary")
	private String employee_salary;

	public employees(int employee_id, String employee_name, String employee_role, String employee_salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_role = employee_role;
		this.employee_salary = employee_salary;
	}

	public employees() {
		super();
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_role() {
		return employee_role;
	}

	public void setEmployee_role(String employee_role) {
		this.employee_role = employee_role;
	}

	public String getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(String employee_salary) {
		this.employee_salary = employee_salary;
	}

	@Override
	public String toString() {
		return "employees [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_role="
				+ employee_role + ", employee_salary=" + employee_salary + "]";
	}

}
