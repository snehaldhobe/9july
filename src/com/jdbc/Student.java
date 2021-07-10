package com.jdbc;

public class Student {


	int rno,marks;
	String name;
	
	public Student(int rno, int marks, String name) {
		super();
		this.rno = rno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
}
