package com.solvd.farmapp.bin;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "fieldlivestock")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "fieldlivestock")
public class FieldLivestock {

	@JsonProperty(value = "fieldid")
	@XmlAttribute
	private int fieldId;
	@JsonProperty(value = "livestockid")
	@XmlAttribute
	private int livestockId;
	private Date startDate;
	private Date endDate;

	public FieldLivestock(int fieldId, int livestockId, Date startDate, Date endDate) {
		super();
		this.fieldId = fieldId;
		this.livestockId = livestockId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public FieldLivestock() {

	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public int getLivestockId() {
		return livestockId;
	}

	public void setLivestockId(int livestockId) {
		this.livestockId = livestockId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "FieldLivestock [fieldId=" + fieldId + ", livestockId=" + livestockId + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

}
