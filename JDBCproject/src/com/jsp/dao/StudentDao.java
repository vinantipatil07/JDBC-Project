package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.jsp.dto.Student;
import com.jsp.util.HelperClass;

public class StudentDao {
	HelperClass helperclass=new HelperClass();
	//method to save student
	public void saveStudent(Student student) {
		// crud operations are performed only in dao
		String sql="INSERT INTO student VALUES(?,?,?,?,?)";
		Connection connection=helperclass.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			preparedStatement.setString(4,student.getGender());
			preparedStatement.setLong(5,student.getPhoneno());
			
			preparedStatement.execute();
			System.out.println("good");
			
			if(connection!=null) {
				connection.close();
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		public void updateStudent(Student student) {
			String sql="UPDATE student SET name=?,email=?,gender=?,phoneno=? WHERE id=?";
			Connection connection=helperclass.getConnection();
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				
				preparedStatement.setString(1,student.getName());
				preparedStatement.setString(2,student.getEmail());
				preparedStatement.setString(3,student.getGender());
				preparedStatement.setLong(4,student.getPhoneno());
				preparedStatement.setInt(5, student.getId());
				
				int n=preparedStatement.executeUpdate();
				if(n>0) {
				System.out.println("all good");
				}else {
					System.out.println("not good");
				
				}
					connection.close();
				
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			// batch execution
			public void addMultipleStudent(List<Student>students) {
				Connection connection = helperclass.getConnection();
				String sql = "INSERT INTO students values(?,?,?,?)";
				PreparedStatement ps = null;
				//for each loop
				
				for(Student s : students) {
					
					try {
						ps = connection.prepareStatement(sql);
						ps.setInt(1, s.getId());
						ps.setString(2, s.getName());
						ps.setString(3, s.getEmail());
						ps.setLong(4, s.getPhoneno());
						ps.addBatch();
						ps.executeBatch();
						System.out.println("all good");	
					} catch(SQLException e) {
						e.printStackTrace();
					}
				}
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				}

				
				
				//method to delete student
				public void deleteStudent(Student student) {
					String sql="DELETE FROM student WHERE ID=?";
					Connection connection = helperclass.getConnection();
					try {
						PreparedStatement ps=connection.prepareStatement(sql);
						ps.setInt(1, student.getId());
						ps.executeUpdate();
						System.out.println("data is deleted");
						if (connection != null) {
							connection.close();
						}} catch (SQLException e) {
							e.printStackTrace();
						}
					
					
					
				
			
					
	
				
				}
}
		
		
		
	
	
	
