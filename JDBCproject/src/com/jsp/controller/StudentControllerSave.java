package com.jsp.controller;

import java.sql.SQLException;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentControllerSave {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setName("Vini");
		student.setEmail("vinantipatil07@gmail.com");
		student.setGender("Female");
		student.setPhoneno(7083626655l);
		student.setId(2);
		
		StudentDao studentDao=new StudentDao();
		studentDao.saveStudent(student);

}
}
