package com.solvd.farmapp.bin;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "expenses")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "expenses")
public class Expenses {

	@JsonProperty(value = "expense_id")
	@XmlAttribute
	private int expense_Id;
	@JsonProperty(value = "field_id")
	@XmlAttribute
	private int field_Id;
	private Date expense_Date;
	@JsonProperty(value = "expense_type")
	@XmlAttribute
	private Date expense_Type;
	@JsonProperty(value = "expense_amount")
	@XmlAttribute
	private int expense_Amount;

	public Expenses(int expense_Id, int field_Id, Date expense_Date, Date expense_Type, int expense_Amount) {
		super();
		this.expense_Id = expense_Id;
		this.field_Id = field_Id;
		this.expense_Date = expense_Date;
		this.expense_Type = expense_Type;
		this.expense_Amount = expense_Amount;
	}

	public Expenses() {
		super();
	}

	public int getExpense_Id() {
		return expense_Id;
	}

	public void setExpense_Id(int expense_Id) {
		this.expense_Id = expense_Id;
	}

	public int getField_Id() {
		return field_Id;
	}

	public void setField_Id(int field_Id) {
		this.field_Id = field_Id;
	}

	public Date getExpense_Date() {
		return expense_Date;
	}

	public void setExpense_Date(Date expense_Date) {
		this.expense_Date = expense_Date;
	}

	public Date getExpense_Type() {
		return expense_Type;
	}

	public void setExpense_Type(Date expense_Type) {
		this.expense_Type = expense_Type;
	}

	public int getExpense_Amount() {
		return expense_Amount;
	}

	public void setExpense_Amount(int expense_Amount) {
		this.expense_Amount = expense_Amount;
	}

	@Override
	public String toString() {
		return "Expenses [expense_Id=" + expense_Id + ", field_Id=" + field_Id + ", expense_Date=" + expense_Date
				+ ", expense_Type=" + expense_Type + ", expense_Amount=" + expense_Amount + "]";
	}

	
}
