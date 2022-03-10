package com.assignment.five;

public class Person {
	private String name;
	private String city;
	private long phone;
	
	
	public Person(String name, String city, long phone) {
		super();
		this.name = name;
		this.city = city;
		this.phone = phone;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getPersonDetails() {
		return this.name+" "+this.city+" "+this.phone;
	}
	
}
