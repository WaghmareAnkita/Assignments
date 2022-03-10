package com.assignment.TenEleven;

public class Main {

	public static void main(String[] args) {
		Monitor benq=new Monitor("BenQ", "qhd", 27);
		Monitor lg=new Monitor("LG", "uhd", 32);
		Monitor dell=new Monitor("Dell", "fhd", 24);
		
		CPU intel=new CPU("Intel", "64-bit", "i7 11th gen");
		CPU amd=new CPU("AMD", "64-bit", "ryzen 5800HX");
		
		Mouse logitech=new Mouse("Logitech", true);
		Mouse corsair=new Mouse("Dell", false);
		
		Keyboard hp=new Keyboard("HP", false, false);
		Keyboard asus=new Keyboard("ASUS", true, true);
		
		Computer c1=new Computer(benq, hp, logitech, amd);
		Computer c2=new Computer(lg, asus, corsair, intel);
		Computer c3=new Computer(dell, hp, logitech, amd);
		Computer c4=new Computer(benq, hp, corsair, intel);
		
		
	}
}
