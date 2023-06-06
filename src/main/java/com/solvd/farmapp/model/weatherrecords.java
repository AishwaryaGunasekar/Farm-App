package com.solvd.farmapp.model;

import java.util.Date;

public class weatherrecords {

	private int weather_id;
	private int field_id;
	private Date weather_date;
	private int temperature;
	private String rainfall;

	public weatherrecords(int weather_id, int field_id, Date weather_date, int temperature, String rainfall) {
		super();
		this.weather_id = weather_id;
		this.field_id = field_id;
		this.weather_date = weather_date;
		this.temperature = temperature;
		this.rainfall = rainfall;
	}

	public weatherrecords() {
		super();
	}

	public int getWeather_id() {
		return weather_id;
	}

	public void setWeather_id(int weather_id) {
		this.weather_id = weather_id;
	}

	public int getField_id() {
		return field_id;
	}

	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

	public Date getWeather_date() {
		return weather_date;
	}

	public void setWeather_date(Date weather_date) {
		this.weather_date = weather_date;
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
		return "weatherrecords [weather_id=" + weather_id + ", field_id=" + field_id + ", weather_date=" + weather_date
				+ ", temperature=" + temperature + ", rainfall=" + rainfall + "]";
	}

}
