package com.examples.S02Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", HomeAddress=" + HomeAddress + ", OfficeAddress="
				+ OfficeAddress + "]";
	}
	//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + "]";
//	}
	int id;
	String name;
	@Autowired
	@Qualifier("add1")
	private Address HomeAddress;
	
	
	public Address getHomeAddress() {
		return HomeAddress;
	}
	@Autowired
	public void setHomeAddress(Address add1) {
		HomeAddress = add1;
	}
	
	public int getId() {
	 return id;}
	public void setId(int id) {
		this.id=id;}
	public String getName() {
		return name;}
	public void setName(String name) {
		this.name=name;
		
	}
	@Autowired
	@Qualifier("add2")
	private Address OfficeAddress;
	
	
	public Address getOfficeAddress() {
		return HomeAddress;
	}
	@Autowired
	public void setOfficeAddress(Address add2) {
		HomeAddress = add2;
	}
}