package com.globant.university;
import java.util.ArrayList;
import com.globant.university.Teacher;


public class Lesson {
	
	private String name; 
	private String classroom; 
	private Teacher teacher; 
	private ArrayList<Student> studentList;



	private static int amount=0; 


	public Lesson(String name, String classroom, Teacher teacher, ArrayList<Student> studentList ) {
	
		this.name=name;
		this.classroom=classroom;
		this.teacher=teacher;
		this.studentList=studentList;
		amount++;
	}
	


	static int getAmount() {
		return amount;
	}

	
	public  String toStringSubMenu() {
		
		 return name;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public  String toStringObject() {
		
		 return "Classroom: "+classroom+ "\nTeacher:" + teacher.toString()+"\nStudent List: " ;
	}
	

	public String getName() {
		return name;
	}
	
	
			
	public String searchStudent(long id, ArrayList<Teacher> teacherList) {
		return "x";
	}

	public Teacher getTeacher() {
		return teacher;
	}
	

	

}
