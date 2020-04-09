package com.globant.university;
import com.globant.university.Teacher;

public class PartTimeTeacher extends Teacher{
	
	private int hoursPerWeek;
	
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}


	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}


	public PartTimeTeacher(String name, float baseSalary, int hoursPerWeek) {
		super(name, baseSalary);
		this.hoursPerWeek=hoursPerWeek;

	}
	

	@Override
	public float getSalary() {
		// TODO Auto-generated method stub
		return baseSalary*hoursPerWeek*4;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "|"+"Nombre: "+ name + "|"+" Base Salary: "+ baseSalary +"|"+" Hours per Week: "+hoursPerWeek +"|"+" Salary: "+getSalary();
	}
	
	
}

