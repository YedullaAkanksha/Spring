package com.examples.S03stereotypes.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	@Value("Chennai")
	private String city;
	@Value("TN")
	private String state;
	@Value("567")
	private String pincode;
	
	
}
