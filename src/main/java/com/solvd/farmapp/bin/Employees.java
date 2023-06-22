package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "employees")
public class Employees {

	@JsonProperty(value = "employee_id")
	@XmlAttribute
	private int employee_Id;
	@JsonProperty(value = "employee_name")
	@XmlAttribute
	private String employee_Name;
	@JsonProperty(value = "employee_role")
	@XmlAttribute
	private String employee_Role;
	@JsonProperty(value = "employee_salary")
	@XmlAttribute
	private String employee_Salary;

	public Employees(int employee_Id, String employee_Name, String employee_Role, String employee_Salary) {
		super();
		this.employee_Id = employee_Id;
		this.employee_Name = employee_Name;
		this.employee_Role = employee_Role;
		this.employee_Salary = employee_Salary;
	}

	public Employees() {
		super();
	}

	public int getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	public String getEmployee_Name() {
		return employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}

	public String getEmployee_Role() {
		return employee_Role;
	}

	public void setEmployee_Role(String employee_Role) {
		this.employee_Role = employee_Role;
	}

	public String getEmployee_Salary() {
		return employee_Salary;
	}

	public void setEmployee_Salary(String employee_Salary) {
		this.employee_Salary = employee_Salary;
	}

	@Override
	public String toString() {
		return "Employees [employee_Id=" + employee_Id + ", employee_Name=" + employee_Name + ", employee_Role="
				+ employee_Role + ", employee_Salary=" + employee_Salary + "]";
	}

}
