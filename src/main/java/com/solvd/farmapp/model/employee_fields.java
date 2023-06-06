package com.solvd.farmapp.model;

public class employee_fields {

	private int employee_id;
	private int field_id;
	private String start_date;
	private String end_date;

	public employee_fields(int employee_id, int field_id, String start_date, String end_date) {
		super();
		this.employee_id = employee_id;
		this.field_id = field_id;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public employee_fields() {
		super();
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getField_id() {
		return field_id;
	}

	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "employee_fields [employee_id=" + employee_id + ", field_id=" + field_id + ", start_date=" + start_date
				+ ", end_date=" + end_date + "]";
	}

}
