package com.assignment.eight;

public class Student {
	
	private String name;
	private String collegeName;
	private float marks;
	
//	public Student() {
//		
//	}
	public Student(String name,String collegeName,float marks) {
		this.name=name;
		this.collegeName=collegeName;
		this.marks=marks;
	}
	
	public float getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {
//		Student s=new Student();
		Student s1=new Student("Ankita Waghmare","MGM College of Engineering",7.78f);
		System.out.println(s1.getMarks());
		System.out.println(s1.getName());
		System.out.println(s1.getCollegeName());
		/*
		 *without default constructor we can only create the object using the parameterized constructor 
		 */
	}
	
}
