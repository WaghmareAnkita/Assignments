package com.assignment.TenEleven;

public class Computer {

	private Monitor monitor;
	private Keyboard keyboard;
	private Mouse mouse;
	private CPU cpu;
	
	public Computer( Monitor monitor,Keyboard keyboard,Mouse mouse,CPU cpu) {
		this.monitor=monitor;
		this.keyboard=keyboard;
		this.mouse=mouse;
		this.cpu=cpu;
	}
}
