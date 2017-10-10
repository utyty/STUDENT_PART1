package com.student_part1;

import java.util.ArrayList;
import java.util.HashMap;



public class Module {
	
	private String modName;
	private String modID;
	//ArrayList<Student> studentList = new ArrayList<Student>();
	private final HashMap<String, Student> studentsList = new HashMap<String, Student>();

	//public Module (String modName, String modID, ArrayList<Student> list ){
	public Module (String modName, String modID ){
		
		this.modName=modName;
		this.modID=modID;
		//StudentList=list;
	}
	
	
	public void add(Student a){
		studentsList.put(a.getIDnum(),a);
		a.addModule(this);
		a.addModName(this.modID);;
	}
	
	
	public void addStudents( ArrayList<Student> students){
		for ( Student std:students){
			this.studentsList.put(std.getIDnum(), std);
			std.addModule(this);
			std.addModName(this.modID);;
		}
	}
	
	
	public  ArrayList<Student> getStudentList(){
		return new ArrayList<Student> (studentsList.values());
	}

	
    public void setModuleName( String nm){
    	this.modName=nm;
    }

	public String getModuleName(){
		return modName;
	}
	
	public void setModuleId(String id){
		this.modID=id;
	}
	
	public String getModuleId(){
		return this.modID;
	}
	
	
	@Override
	public String toString(){
		return this.modID + " : " + this.modName;
	}

}
