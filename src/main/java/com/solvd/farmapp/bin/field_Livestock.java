package com.solvd.farmapp.bin;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName(value = "field_Livestock")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "field_Livestock")
public class field_Livestock {

	
	@JsonProperty(value = "field_id")
	private int field_id;
	@JsonProperty(value = "livestock_id")
	private int livestock_id;
	
	private Date start_date;
	private Date end_date;

	public field_Livestock(int field_id, int livestock_id, Date start_date, Date end_date) {
		super();
		this.field_id = field_id;
		this.livestock_id = livestock_id;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public field_Livestock() {
		super();
	}

	public int getField_id() {
		return field_id;
	}

	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

	public int getLivestock_id() {
		return livestock_id;
	}

	public void setLivestock_id(int livestock_id) {
		this.livestock_id = livestock_id;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "field_Livestock [field_id=" + field_id + ", livestock_id=" + livestock_id + ", start_date=" + start_date
				+ ", end_date=" + end_date + "]";
	}

}
