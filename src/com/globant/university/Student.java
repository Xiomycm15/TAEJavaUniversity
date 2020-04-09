package com.globant.university;

public class Student {
	


	private String name; 
	private long id; 



	private int age; 

	public Student(String name,long id, int age) {
		
		this.name=name;
		this.id=id;
		this.age=age;
		
	}
	
	
	public  String toString() {
		
		 return "|"+"Student Name: "+name+"|"+ " Id: "+id+"|"+" Age: "+ age+ "|";
	}
	public long getId() {
		return id;
	}
}
