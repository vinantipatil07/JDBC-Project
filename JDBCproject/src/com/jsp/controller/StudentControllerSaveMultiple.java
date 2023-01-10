package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentControllerSaveMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1=new Student();
		s1.setId(70);
		s1.setName("abcd");
		s1.setEmail("abcd@gmail.com");
		s1.setGender("female");
		s1.setPhoneno(1122334455);
		
		Student s2=new Student();
		s2.setId(80);
		s2.setName("abcd");
		s2.setEmail("abcd@gmail.com");
		s2.setGender("female");
		s2.setPhoneno(1122334455);
		
		Student s3=new Student();
		s3.setId(90);
		s3.setName("abcd");
		s3.setEmail("abcd@gmail.com");
		s3.setGender("female");
		s3.setPhoneno(1122334455);
		
		Student s4=new Student();
		s4.setId(91);
		s4.setName("abcd");
		s4.setEmail("abcd@gmail.com");
		s4.setGender("female");
		s4.setPhoneno(1122334455);
		
		
		
		a1.add(s4);
		a1.add(s3);
		a1.add(s2);
		a1.add(s1);
		
		StudentDao studentDao=new StudentDao();
		studentDao.addMultipleStudent(a1);
		
		

	}

}
