package com.globant.university;

import com.globant.university.Teacher;

public class FullTimeTeacher extends Teacher {

	private int experienceYears;
		
	public FullTimeTeacher(String name, float baseSalary, int experienceYears) {
		super(name, baseSalary);
		this.experienceYears=experienceYears;
	
	}
	

	@Override
	public float getSalary() {
		// TODO Auto-generated method stub
		return baseSalary*((110*experienceYears)/100);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "|"+"Nombre: "+ name +"|"+ " Base Salary: "+ baseSalary +"|"+ " Experience Years: "+experienceYears +"|"+ " Salary: "+ getSalary()+"|";
	}
	
	

}

