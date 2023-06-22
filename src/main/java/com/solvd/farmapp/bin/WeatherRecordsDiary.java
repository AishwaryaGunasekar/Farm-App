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

	@JsonProperty(value = "weather_id")
	@XmlAttribute
	private int weather_Id;

	@JsonProperty(value = "field_id")
	@XmlAttribute
	private int field_Id;

	private Date weather_Date;

	@JsonProperty(value = "temperature")
	@XmlAttribute
	private int temperature;

	@JsonProperty(value = "rainfall")
	@XmlAttribute
	private String rainfall;

	public WeatherRecordsDiary(int weather_Id, int field_Id, Date weather_Date, int temperature, String rainfall) {
		super();
		this.weather_Id = weather_Id;
		this.field_Id = field_Id;
		this.weather_Date = weather_Date;
		this.temperature = temperature;
		this.rainfall = rainfall;
	}

	public int getWeather_Id() {
		return weather_Id;
	}

	public void setWeather_Id(int weather_Id) {
		this.weather_Id = weather_Id;
	}

	public int getField_Id() {
		return field_Id;
	}

	public void setField_Id(int field_Id) {
		this.field_Id = field_Id;
	}

	public Date getWeather_Date() {
		return weather_Date;
	}

	public void setWeather_Date(Date weather_Date) {
		this.weather_Date = weather_Date;
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
		return "WeatherRecordsDiary [weather_Id=" + weather_Id + ", field_Id=" + field_Id + ", weather_Date="
				+ weather_Date + ", temperature=" + temperature + ", rainfall=" + rainfall + "]";
	}

}
