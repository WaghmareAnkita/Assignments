package com.assignment.TenEleven;

public class CPU {

	private String brand;
	private String processorType;
	private String processorVersion;
	
	
	public CPU(String brand, String processorType, String processorVersion) {
		this.brand = brand;
		this.processorType = processorType;
		this.processorVersion = processorVersion;
	}


	public String getBrand() {
		return brand;
	}


	public String getProcessorType() {
		return processorType;
	}


	public String getProcessorVersion() {
		return processorVersion;
	}
	
	

}
