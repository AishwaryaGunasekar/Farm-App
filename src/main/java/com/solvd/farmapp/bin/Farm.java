package com.solvd.farmapp.bin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Farm")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Farm")
public class Farm {

	@JsonProperty(value = "id")
	private int id;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "address")
	private String address;

	public Farm(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Farm() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
