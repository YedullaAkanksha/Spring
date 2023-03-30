package com.examples.S03stereotypes.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
	@Value("1")
	private int id;
	@Value("Ron")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
