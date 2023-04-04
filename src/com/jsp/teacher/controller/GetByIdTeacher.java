package com.jsp.teacher.controller;

import com.jsp.teacher.dao.TeacherDao;

public class GetByIdTeacher {

	public static void main(String[] args) {

		TeacherDao teacherDao = new TeacherDao();
		teacherDao.getByIdTeacher();

	}
}
