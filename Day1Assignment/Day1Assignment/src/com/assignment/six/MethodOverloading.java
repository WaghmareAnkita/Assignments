package com.assignment.six;

public class MethodOverloading {

	public void add() {
		System.out.println("Zero paramaterized add()");
	}
	public int add(int i, int j) {
		System.out.println("add(int int) = "+(i+j));
		return i+j;
	}
	public double add(double d, int i) {
		System.out.println("add(double int) = "+(i+d));
		return d+i;
	}
	public double add(int i, double d) {
		System.out.println("add(int double) = "+(i+d));
		return i+d;
	}
	public void add(int i, int j, int k) {
		System.out.println("add(int int int) = "+(i+j+k));
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.add();
		mo.add(3,6);
		mo.add(5.99,9);
		mo.add(8,33.98);
		mo.add(3,7,2);
	}
}
