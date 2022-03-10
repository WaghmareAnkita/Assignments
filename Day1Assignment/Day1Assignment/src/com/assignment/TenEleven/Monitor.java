package com.assignment.TenEleven;

public class Monitor {
	
	private String brand;
	private String resolution;
	private int screenSize;
	
	public Monitor(String brand, String resolution, int screenSize) {
		this.brand = brand;
		this.resolution = resolution;
		this.screenSize = screenSize;
	}

	public String getBrand() {
		return brand;
	}

	public String getResolution() {
		return resolution;
	}

	public int getScreenSize() {
		return screenSize;
	}
	
	

}
