package com.example.beans;

public class Employee {

	private int empNo;
	private String name;
	private Address address;//has-a relationship-association
	
	public Employee() {}

	public Employee(int empNo, String name, Address address) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.address = address;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
