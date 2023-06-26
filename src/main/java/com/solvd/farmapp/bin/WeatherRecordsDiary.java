package com.solvd.farmapp.bin;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "WeatherRecordsDiary")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WeatherRecordsDiary")
public class WeatherRecordsDiary {

	@JsonProperty(value = "weatherid")
	@XmlAttribute
	private int weatherId;

	@JsonProperty(value = "fieldid")
	@XmlAttribute
	private int fieldId;

	private Date weatherDate;

	@JsonProperty(value = "temperature")
	@XmlAttribute
	private int temperature;

	@JsonProperty(value = "rainfall")
	@XmlAttribute
	private String rainfall;

	public WeatherRecordsDiary(int weatherId, int fieldId, Date weatherDate, int temperature, String rainfall) {
		super();
		this.weatherId = weatherId;
		this.fieldId = fieldId;
		this.weatherDate = weatherDate;
		this.temperature = temperature;
		this.rainfall = rainfall;
	}

	public WeatherRecordsDiary() {

	}

	public int getWeatherId() {
		return weatherId;
	}

	public void setWeatherId(int weatherId) {
		this.weatherId = weatherId;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public Date getWeatherDate() {
		return weatherDate;
	}

	public void setWeatherDate(Date weatherDate) {
		this.weatherDate = weatherDate;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getRainfall() {
		return rainfall;
	}

	public void setRainfall(String rainfall) {
		this.rainfall = rainfall;
	}

	@Override
	public String toString() {
		return "WeatherRecordsDiary [weatherId=" + weatherId + ", fieldId=" + fieldId + ", weatherDate=" + weatherDate
				+ ", temperature=" + temperature + ", rainfall=" + rainfall + "]";
	}

}
