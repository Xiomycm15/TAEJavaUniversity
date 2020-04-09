package com.globant.university;

public class Validations {
	static String namev; 
	static String idv; 
	static String agev;
	static String optionv; 
	static String idv2; 
	static String namevc;
	static String classroomv;
	static Teacher teacherv;
	static String type;
	static String tname;
	static int eyv;
	static int hpwv;
	static float baseSalary;
	
    static boolean isInteger(String cadena){
    	try {
    		Integer.parseInt(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    }

    static boolean isLong(String cadena){
    	try {
    		Long.parseLong(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    
      
    }
    
    static boolean validOption(String option){
    	if(option.contentEquals("1")) {
			return true;
			
		}else if(option.contentEquals("2")){
			return true;
		
		}else if(option.contentEquals("3")) {
			return true;
		
		
		}else {
			
			
			return false;
		}
    	
    	
    }


}
