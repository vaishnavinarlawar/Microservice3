package com.tech.demo.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address-db")
public class Address {
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column
	private int id;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String pincode;
	
	public Address(int id, String city, String state, String pincode) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
	

}
