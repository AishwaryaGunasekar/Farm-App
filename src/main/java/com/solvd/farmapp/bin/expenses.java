package com.solvd.farmapp.bin;

import java.util.Date;

public class expenses {

	private int expense_id;
	private int field_id;
	private Date expense_date;
	private Date expense_type;
	private int expense_amount;

	public expenses(int expense_id, int field_id, Date expense_date, Date expense_type, int expense_amount) {
		super();
		this.expense_id = expense_id;
		this.field_id = field_id;
		this.expense_date = expense_date;
		this.expense_type = expense_type;
		this.expense_amount = expense_amount;
	}

	public expenses() {
		super();
	}

	public int getExpense_id() {
		return expense_id;
	}

	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}

	public int getField_id() {
		return field_id;
	}

	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

	public Date getExpense_date() {
		return expense_date;
	}

	public void setExpense_date(Date expense_date) {
		this.expense_date = expense_date;
	}

	public Date getExpense_type() {
		return expense_type;
	}

	public void setExpense_type(Date expense_type) {
		this.expense_type = expense_type;
	}

	public int getExpense_amount() {
		return expense_amount;
	}

	public void setExpense_amount(int expense_amount) {
		this.expense_amount = expense_amount;
	}

	@Override
	public String toString() {
		return "expenses [expense_id=" + expense_id + ", field_id=" + field_id + ", expense_date=" + expense_date
				+ ", expense_type=" + expense_type + ", expense_amount=" + expense_amount + "]";
	}

}
