package com.assignment.TenEleven;

public class Keyboard {

	private String brand;
	private boolean wireless;
	private boolean mechanical;
	
	public Keyboard(String brand, boolean wireless, boolean mechanical) {
		this.brand = brand;
		this.wireless = wireless;
		this.mechanical = mechanical;
	}

	public String getBrand() {
		return brand;
	}

	public boolean isWireless() {
		return wireless;
	}

	public boolean isMechanical() {
		return mechanical;
	}
	
	
	
	
	
}
