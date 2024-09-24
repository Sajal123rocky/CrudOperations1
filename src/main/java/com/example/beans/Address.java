package com.example.beans;

public class Address {

	private int addId;
	private String city;
	public Address() {}
	
	public Address(int addId, String city) {
		super();
		this.addId = addId;
		this.city = city;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
//	@Override
//	public String toString() {
//		return "Address [addId=" + addId + ", city=" + city + "]";
//	}
	
	
}
