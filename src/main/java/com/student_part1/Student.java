package com.student_part1;

import java.util.ArrayList;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;




public class Student {
	
	private DateTimeFormatter  dateConv= DateTimeFormat.forPattern("dd-mm-yyyy");
	//private ArrayList<Course> course = new ArrayList<Course>(); try to implement with hashmap for multiply courser need key value in course
	private Course course;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private ArrayList<String> modulesNames = new ArrayList<String>();
	private String first_name;
	private String surname;
	private int age;
	private String username;
	private LocalDate DOB;
	private String numberID;

	
	public Student (String name1, String name2, String dob, int userID  ) {
		this.first_name=name1;
		this.surname=name2;
		this.DOB=dateConv.parseLocalDate(dob);
		setUsername(name2,getAge());
		setId(userID);
		}
	
	
	// setters and getters 
	public void setUsername(String sname,int age){	
		this.username=sname+age; }
	
	
	public String getUsername(){
		return this.username;  	 }

	
	public void setFirstName( String name){
		this.first_name=name;	}
	
	
	public String getFirstName(){
		return this.first_name;	}
	
	
	public void setSurname( String name){
		this.surname=name;	}
	
	
	public String getSurname(){
		return surname;	}
	
	
	public LocalDate getDOB(){
		return DOB;	}
	
	
	public void setAge(int nm){
		this.age=nm;  }
	
	
	public int getAge(){
		return  (new LocalDate().now().getYear() - DOB.getYear());	}
	
	
	public void addModule( Module mod){
		this.modules.add(mod);  }
	
	
	public ArrayList<Module> getModules(){
		return modules;  }
	
	
	public void addCourse( Course cor){
		this.course=cor;   }
	

	public Course getCourse(){
		return this.course;   }
	
	
	public void setId( int n){
		numberID= ( new LocalDate().now().getYear() +"0" +this.getAge() +"0"+n);  }
	
	
	public String getIDnum(){
		return numberID;  }
	
	public void addModName(String name){
		this.modulesNames.add(name);
	}
	
	public ArrayList<String> getModulesNames(){
		return this.modulesNames;
	}
	
	@Override
	public String toString(){
		return this.first_name + " " + this.surname +" " + this.course + " "+ this.modulesNames;
	}

}
