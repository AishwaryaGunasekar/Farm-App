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

	@JsonProperty(value = "expenseid")
	@XmlAttribute
	private int expenseId;
	@JsonProperty(value = "fieldid")
	@XmlAttribute
	private int fieldId;
	private Date expenseDate;
	@JsonProperty(value = "expensetype")
	@XmlAttribute
	private Date expenseType;
	@JsonProperty(value = "expenseamount")
	@XmlAttribute
	private int expenseAmount;

	public Expenses(int expenseId, int fieldId, Date expenseDate, Date expenseType, int expenseAmount) {
		super();
		this.expenseId = expenseId;
		this.fieldId = fieldId;
		this.expenseDate = expenseDate;
		this.expenseType = expenseType;
		this.expenseAmount = expenseAmount;
	}

	public Expenses() {

	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	public Date getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(Date expenseType) {
		this.expenseType = expenseType;
	}

	public int getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(int expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	@Override
	public String toString() {
		return "Expenses [expenseId=" + expenseId + ", fieldId=" + fieldId + ", expenseDate=" + expenseDate
				+ ", expenseType=" + expenseType + ", expenseAmount=" + expenseAmount + "]";
	}

}
