package com.student_part1;

import static org.junit.Assert.*;

import org.junit.Test;


public class StudentTest {

	@Test
	public void getUsername() throws Exception {
		Student std = new Student ( "Petter","Murphy", "04-11-1992", 1001);
		String expected = "Murphy25";
		String result=std.getUsername();
		assertEquals(expected,result);
		
		Student std2 = new Student ( "Jaroslaw","Jakubowicz", "04-11-1982", 1001);
		String expected2 = "Jakubowicz35";
		String result2=std2.getUsername();
		assertEquals(expected2,result2);
	}
}
