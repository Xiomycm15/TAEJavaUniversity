package com.globant.university;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class UniversitySystem {
	
	 

	public static void main (String [ ] args) {
		
		//1. Initialize minimum 2 different teachers of each type (full time, part time).
		FullTimeTeacher teacher1= new FullTimeTeacher("Marco Teran",5000000,5);
		FullTimeTeacher teacher2= new FullTimeTeacher("Jesus Ochoa",4500000,9);
		FullTimeTeacher teacher3= new FullTimeTeacher("Mario Lopez",7000000,3);
		
		PartTimeTeacher teacher4= new PartTimeTeacher("Lorena Epíndola",3000000,5);
		PartTimeTeacher teacher5= new PartTimeTeacher("Dolly Suarez",3300000,7);
		PartTimeTeacher teacher6= new PartTimeTeacher("Mariana Díaz",3100000,4);
		
		//List University teachers
		
		ArrayList<Teacher> teacherList= new ArrayList();
	
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		teacherList.add(teacher3);
		teacherList.add(teacher4);
		teacherList.add(teacher5);
		teacherList.add(teacher6);
		
		//2. Initialize minimum 6 different students Student(String name,long id, int age)
		Student student1= new Student("Xiomara Camacho", 1015446494, 25);
		Student student2= new Student("David Angel", 1013476892, 26);
		Student student3= new Student("Laura Monroy", 1025948194, 25);
		Student student4= new Student("Camilo Diaz", 1025788195, 24);
		Student student5= new Student("Santiago Loaiza", 1026643394, 25);
		Student student6= new Student("Sara Espitia", 1026643394, 25);
		Student student7= new Student("Laura Gomez", 1023644394, 25);
		Student student8= new Student("Paula Aguirre", 1056640994, 25);
		Student student9= new Student("Felipe Díaz", 1026743304, 25);
	
		
		//List University Students 
		ArrayList<Student> studentUniversityList= new ArrayList();

		studentUniversityList.add(student1);
		studentUniversityList.add(student2);
		studentUniversityList.add(student3);
		studentUniversityList.add(student4);
		studentUniversityList.add(student5);
		studentUniversityList.add(student8);
		studentUniversityList.add(student9);

		
		//List Machine Data Science 
		ArrayList<Student> studentListDS= new ArrayList();

		studentListDS.add(student1);
		studentListDS.add(student2);
		studentListDS.add(student3);

		//List Machine Learning Students 
		ArrayList<Student> studentListML= new ArrayList();

		studentListML.add(student4);
		studentListML.add(student5);
		studentListML.add(student6);
		studentListML.add(student1);
		
		//List Machine Automation 
		ArrayList<Student> studentListAu= new ArrayList();

		studentListAu.add(student7);
		studentListAu.add(student8);
		studentListAu.add(student9);
		studentListAu.add(student1);
		
		/*3. Initialize minimum 4 different classes including its teacher , students and other relevant data
		Lesson(String name, String classroom, Teacher teacher, ArrayList<Student> studentList)*/

		Lesson lesson1= new Lesson("Data Science","C-101", teacher1,studentListDS);
		Lesson lesson2= new Lesson("Machine Learning","B-102", teacher2,studentListML);
		Lesson lesson3= new Lesson("Test Automation","A-103", teacher3,studentListAu);
		
		ArrayList<Lesson> lessonList= new ArrayList();

		lessonList.add(lesson1);
		lessonList.add(lesson2);
		lessonList.add(lesson3);
		
		
		//4. Print a menú including the following options:
		Scanner snn = new Scanner(System.in);
		boolean exitt=false; 
		int optionn;
		
		while(!exitt) {
		
			System.out.println("\n Main Menu:\n ");
			System.out.println("1. Print all the professors with its data ");
			System.out.println("2. Print all the classes and a submenu to select a class in order to print the class data including its teacher and students ");
			System.out.println("3. Create a new student and add it to an existing class");
			System.out.println("4. Create a new class and add a teacher, students and its relevant data");
			System.out.println("5. List all the classes in which a given student is included (hint: search by id) ");
			System.out.println("6. Exit\n ");
		
			try {
				System.out.print("Please choose an option: ");
				
				optionn=snn.nextInt();
				
				switch(optionn) {
				
		//a. Print all the professors with its data
				case 1:
		System.out.println("\n Teachers Full Time data:\n ");
			for(Teacher teacherList2: teacherList) {
					if(teacherList2 instanceof FullTimeTeacher) {
					System.out.println(teacherList2.toString());
				}
			}
			
		System.out.println("\n Teachers Part Time data:\n ");
			for(Teacher teacherList2: teacherList) {
					if(teacherList2 instanceof PartTimeTeacher) {
					System.out.println(teacherList2.toString());
				}
			}
			
			break;
		//b. Print all the classes and a submenu to select a class in order to print the class data including its teacher and students
				case 2:
		Scanner sn = new Scanner(System.in);
		boolean exit=false; 
		int option;
		
		while(!exit) {
			System.out.println("\n Menu:\n");
			for( int i = 0 ; i < lessonList.size() ; i++ ){
				
				  System.out.println(i+1+". "+lessonList.get(i).toStringSubMenu());
				}
			System.out.println("4. Comeback to main menu");
			
			
			try {
			System.out.println("Please choose an option: ");
			
			option=sn.nextInt();
			
			switch(option) {
			
				case 1: 
					System.out.println("Data Science Lesson Information: \n");
					System.out.println(lesson1.toStringObject());
					
					for(Student studentListDS2: lesson1.getStudentList()) {
						System.out.println(studentListDS2.toString());
					}
					
					break; 
				
				case 2:
					System.out.println("Machine Learning Lesson Information: \n ");
					System.out.println(lesson2.toStringObject());
					for(Student studentListML2: lesson2.getStudentList()) {
						System.out.println(studentListML2.toString());
					}
					break; 
					
				case 3:
					System.out.println("Automation Lesson Information: \n ");
					System.out.println(lesson3.toStringObject());
					for(Student studentListAu2: lesson3.getStudentList()) {
						System.out.println(studentListAu2.toString());
					}
					break; 
					
				case 4:
					System.out.println("ComeBack to Main Menu: \n ");
					exit=true; 
					break; 

				default:
					System.out.println("Please input a valid option ");
				
			}
			}catch(InputMismatchException e) {
				System.out.println("Please input a valid option");
				sn.next();
			}
			
		}
		
		break;
	// c. Create a new student and add it to an existing class: 
	//public Student(String name,long id, int age) {
		
				case 3:
			
		System.out.println("\nPlease input the data to add a student to an existing class");
		
		Scanner sn2= new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter name student:\n");
		Validations.namev = sn2.nextLine();  // Read user input
	    System.out.println("Enter student id:\n");
	    Validations.idv= sn2.nextLine();  // Read user input
	    System.out.println("Enter student age:\n");
	    Validations.agev= sn2.nextLine();  // Read user input
	    
	    while(Validations.isLong(Validations.idv)==false || Validations.isInteger(Validations.agev)==false) {
	    	System.out.println("No valid data for id and age:\n");
	    	Scanner sn3= new Scanner(System.in);
	    	
	    	
	    	if(Validations.isLong(Validations.idv)==false) {
	    		System.out.println("Please enter valid id:\n");
	    		Validations.idv = sn3.nextLine();  // Read user input
	    	}
	    	if(Validations.isInteger(Validations.agev)==false) {
	    	System.out.println("Please enter valid age:\n");
	     	Validations.agev = sn3.nextLine(); 
	    	}
	    
	    	    	
	    }
	    
	    Long idd = Long.parseLong(Validations.idv);
	    int agee = Integer.parseInt(Validations.agev);
	    
	    
	    Student student11= new Student(Validations.namev, idd, agee);
	    
	    
	    System.out.println("\n");
		for( int i = 0 ; i < lessonList.size() ; i++ ){
			
			  System.out.println(i+1+". "+lessonList.get(i).toStringSubMenu());
			}
		
		
		System.out.println("Please select the lesson for the student: \n");
		Scanner sn4= new Scanner(System.in);
		Validations.optionv=sn4.nextLine();
		
		

		while(Validations.validOption(Validations.optionv)==false) {
			Scanner sn5= new Scanner(System.in); 
			System.out.println("Please choose a valid option: \n");
			
			Validations.optionv=sn5.nextLine();
		}
		
		studentUniversityList.add(student11);
		if(Validations.optionv.contentEquals("1")) {
			studentListDS.add(student11);
			System.out.println("Student has been added successfully to Data Science lesson!\n");
			
		}else if(Validations.optionv.contentEquals("2")){
			studentListML.add(student11);
			System.out.println("Student has been added successfully to Machine Learning lesson!\n");
		}else if(Validations.optionv.contentEquals("3")) {
			studentListAu.add(student11);
			System.out.println("Student has been added successfully to Automation test lesson!\n");
		
		} 
	
		break;
//d. Create a new class and add a teacher, students and its relevant data 
		//	public Lesson(String name, String classroom, Teacher teacher, ArrayList<Student> studentList ) {
	
		case 4:
		System.out.println("\nCreate a Lesson ");
		Scanner sn7= new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter name of the class:\n");
		Validations.namev = sn7.nextLine();  // Read user input
	    System.out.println("Enter classroom:\n");
	    Validations.classroomv= sn7.nextLine();  // Read user input
	
	    
	    System.out.println("1.Enter F for Full Time Teacher");
	    System.out.println("2.Enter P for Full Time Teacher");
	    System.out.println("Enter teacher type:\n");
	  
		Scanner sn8= new Scanner(System.in);
		Validations.type=sn8.nextLine();
		System.out.println("Enter teacher Name:\n");
	    Validations.tname=sn8.nextLine(); 
		System.out.println("Enter teacher Base Salary:\n");
	    Validations.baseSalary=sn8.nextFloat(); 
			
		
		
		if(Validations.type.equals("F")) {
			Scanner sn9= new Scanner(System.in);
			System.out.println("Enter Experience Years");
			Validations.eyv= sn9.nextInt(); 
			Validations.teacherv= new FullTimeTeacher(Validations.tname,Validations.baseSalary,Validations.eyv);
		}
		if(Validations.type.equals("P")) {
			Scanner sn9= new Scanner(System.in);
			System.out.println("Enter Experience Years");
			Validations.hpwv= sn9.nextInt(); 
			Validations.teacherv= new PartTimeTeacher(Validations.tname,Validations.baseSalary,Validations.hpwv);
			
		}	

		Scanner sn10= new Scanner(System.in);  // Create a Scanner object
		
	    

		Lesson lesson4= new Lesson(Validations.namev,Validations.classroomv, Validations.teacherv,studentListAu);
		System.out.println("lesson has been created successful\n");
		System.out.println("A new element has been added to Lesson List has been up!\n");
		lessonList.add(lesson4);
		break;
	    
//e. List all the classes in which a given student is included (hint: search by id)
		case 5:
			
			String idSN;
			System.out.println("\n Please Input the id of the student: \n");
			Scanner sn5= new Scanner(System.in);
			Validations.idv2=sn5.nextLine();
			
		while(Validations.isLong(Validations.idv2)==false) {	
			System.out.println("No valid data for id");
			Scanner sn6= new Scanner(System.in);
			System.out.println("Please enter a valid id:\n");
			Validations.idv2=sn6.nextLine();
			
		}
		
		long id = Long.parseLong(Validations.idv2);
	
		
		boolean flag = false;
		for( int i = 0 ; i < lessonList.size() ; i++ ){
				
			  
			  for( int j = 0 ; j < lessonList.get(i).getStudentList().size() ; j++ ) {
				  
				  //System.out.println( lessonList.get(i).getStudentList().get(j));
				  
				  if(lessonList.get(i).getStudentList().get(j).getId()==id && i==0) {
					  System.out.println("\n Student is enrolled in lesson: "+ lessonList.get(i).getName());
					  flag=true;
				  }else {
					  flag=false;
				  }
				  if(lessonList.get(i).getStudentList().get(j).getId()==id && i==1) {
					  System.out.println("\n Student is enrolled in lesson: "+ lessonList.get(i).getName());
					  flag=true;
				  } else {
					  flag=false;
				  }
				  if(lessonList.get(i).getStudentList().get(j).getId()==id && i==2) {
					  System.out.println("\n Student is enrolled in lesson: "+ lessonList.get(i).getName());
					  flag=true;
				  }else {
					  flag=false;
				  }
	
			  }
			  
			  if(flag==false && i==2) {
				  System.out.println("\n Sorry! Student ID doesn't exist on any list.");
			  }
			  
			}
		break;
		
		//EXIT
	
		case 6:
			exitt=true;	
		break; 
		
			
		default:
				System.out.println("Please input a valid option ");
			
		}
		}catch(InputMismatchException e) {
			System.out.println("Please input a valid option");
			snn.next();
		}
		  
	}
				
	}
}

