package com.solvd.farmapp.bin;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "field_livestock")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "field_livestock")
public class FieldLivestock {

	@JsonProperty(value = "field_id")
	@XmlAttribute
	private int field_Id;
	@JsonProperty(value = "livestock_id")
	@XmlAttribute
	private int livestock_Id;
	private Date start_Date;
	private Date end_Date;

	public FieldLivestock(int field_Id, int livestock_Id, Date start_Date, Date end_Date) {
		super();
		this.field_Id = field_Id;
		this.livestock_Id = livestock_Id;
		this.start_Date = start_Date;
		this.end_Date = end_Date;
	}

	public FieldLivestock() {
		super();
	}

	public int getField_Id() {
		return field_Id;
	}

	public void setField_Id(int field_Id) {
		this.field_Id = field_Id;
	}

	public int getLivestock_Id() {
		return livestock_Id;
	}

	public void setLivestock_Id(int livestock_Id) {
		this.livestock_Id = livestock_Id;
	}

	public Date getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}

	public Date getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}

	@Override
	public String toString() {
		return "FieldLivestock [field_Id=" + field_Id + ", livestock_Id=" + livestock_Id + ", start_Date=" + start_Date
				+ ", end_Date=" + end_Date + "]";
	}

}
