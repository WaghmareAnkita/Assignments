package com.assignment.four;

public class AccessStatic {
	//static variables
	public static String company="Publicis Sapient";
	public static String name="Ankita Ashokrao Waghmare";
	public static int pincode=560029;
	
	public void ordinaryMethod() {
		System.out.println(company+" : "+name+" : "+pincode);
	}
	public static void main(String[] args) {
		AccessStatic as=new AccessStatic();
		as.ordinaryMethod();
		/*
		 * Only one copy of that member is created for the entire class and is shared by 
		 * all the objects of that class, no matter how many objects are created.
		 * It is initialized before any object of this class is being created, even before main starts.
		 * It is visible only within the class, but its lifetime is the entire program
		 */
	}

}
