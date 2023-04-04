package com.jsp.teacher.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.teacher.util.HelperClass;

public class TeacherDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	public void saveTeacher() {

		connection = helperClass.getConnection();
		String sql = "insert into teacher values(5,'XYZ Sir','abc')";
		try {

			// Create Statement
			Statement statement = connection.createStatement();

			// Execute Statement
			statement.execute(sql);
			System.out.println("Record Inserted");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteTeacher() {

		connection = helperClass.getConnection();
		String sql = "delete from teacher where id =5";
		try {
			// Create Statement
			Statement statement = connection.createStatement();

			// Execute Statement
			int id = statement.executeUpdate(sql);
			if (id > 0)
				System.out.println("Record Deleted");
			else
				System.out.println("Record Not Found");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateTeacher() {

		connection = helperClass.getConnection();
		String sql = "update teacher set name='Nagaveni Maam', subject='SDLC' where id=5";
		try {
			// Create Statement
			Statement statement = connection.createStatement();

			// execute Statement
			int id = statement.executeUpdate(sql);
			if (id > 0)
				System.out.println("Record Updated");
			else
				System.out.println("Record Not Found");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void getAllTeacher() {

		connection = helperClass.getConnection();
		String sql = "select * from teacher";
		try {
			// Create Statement
			Statement statement = connection.createStatement();

			// Execute Statement
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println("=========================================");
				System.out.println("Teacher ID      : " + resultSet.getInt(1));
				System.out.println("Teacher Name    : " + resultSet.getString(2));
				System.out.println("Teacher Subject : " + resultSet.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void getByIdTeacher() {

		connection = helperClass.getConnection();
		String sql = "select * from teacher where id=4";
		try {
			// Create Statement
			Statement statement = connection.createStatement();

			// Execute Statement
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println("==========================================");
				System.out.println("Teacher ID      : " + resultSet.getInt(1));
				System.out.println("Teacher Name    : " + resultSet.getString(2));
				System.out.println("Teacher Subject : " + resultSet.getString(3));
				System.out.println("==========================================");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// CLose Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
