package com.student_part1;


import java.util.ArrayList;
import java.util.HashMap;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;




public class Course {

	private final DateTimeFormatter conventer = DateTimeFormat.forPattern("dd-mm-yyyy");
	private LocalDate courseStart;
	private LocalDate courseEnd;
	private String courseName;
	//ArrayList<Module> modList = new ArrayList<Module>();
	//ArrayList<Student> stdnList = new ArrayList<Student>();
	private final HashMap<String, Module> modList = new HashMap<String, Module>();
	private final HashMap<String, Student> studentsdnList = new HashMap<String, Student>();
	

	//constructor
	public Course ( String name, String start, String end){
		this.courseName=name;
		this.courseStart=conventer.parseLocalDate(start);
		this.courseEnd=conventer.parseLocalDate(end);
		
	}
	
	
	//setters and getters
	
	
	public void add( Module mod){
		this.modList.put(mod.getModuleId(),mod); 
			for ( Student std:mod.getStudentList()){
				this.studentsdnList.put(std.getIDnum(), std);
				std.addCourse(this);
				}
		}
	

//	
//	public void addModules( ArrayList<Module> mod){
//		for ( Module a:mod){
//			modList.add(a);
//		}	}
	
	
	public ArrayList<Module> getModules(){
		return new ArrayList<Module> (modList.values());   }
	
	
	public ArrayList<Student> getStudentList(){
		return new ArrayList<Student> ( studentsdnList.values());
	}
	
	public void setStartDate( String start){
		this.courseStart=conventer.parseLocalDate(start);
	}
	
	public LocalDate getStartDate(){
		return this.courseStart;
	}
	
	public void setEndDate( String end){
		this.courseEnd=conventer.parseLocalDate(end);
	
	}
	
	public LocalDate getEndDate(){
		return this.courseEnd;
	}
	
//	public void getRegStudents(){
//		for(Module a:modList){
//			a.getStudentDetials();
//		}
//		

//	public void addStudents( ArrayList<> a){
//		for ( Module a1:modList){
//			a1.add(a);
//			
//		}
	//}

	
	@Override
	public String toString(){
		return this.courseName;
	}
	
}
