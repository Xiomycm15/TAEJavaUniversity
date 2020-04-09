package com.globant.university;



public abstract class Teacher {
	protected String name; 
	protected float baseSalary; 

	

	public Teacher(String name, float baseSalary) {
		this.name=name;
		this.baseSalary= baseSalary;
	}

	public abstract float getSalary();
	
	public abstract String toString();
	
	
	

}
