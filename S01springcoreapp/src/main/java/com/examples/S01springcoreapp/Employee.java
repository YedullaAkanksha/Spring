package com.examples.S01springcoreapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {
	int id;
	String name;
	int price;
	private Address Address;
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	int quantity;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private List<String> department;
	private Map<Integer,String> products;
	
	private Properties countriesLang;
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	public List<String> getDepartment() {
		return department;
	}
	public void setDepartment(List<String> department) {
		this.department = department;
	}
	public int getId() {
	 return id;}
	public void setId(int id) {
		this.id=id;}
	public String getName() {
		return name;}
	public String setName() {
		return name;}
	public void setName(String name) {
		this.name=name;
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", department="
				+ department + ", products=" + products + ", countriesLang=" + countriesLang + ", Address=" + Address + "]";
	}
	public Properties getcountriesLang() {
		return countriesLang;
	}
	public void setcountriesLang(Properties countriesLang) {
		this.countriesLang = countriesLang;
	}

}
