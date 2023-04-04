package com.jsp.teacher.controller;

import com.jsp.teacher.dao.TeacherDao;

public class UpdateTeacher {

	public static void main(String[] args) {

		TeacherDao teacherDao = new TeacherDao();
		teacherDao.updateTeacher();

	}
}
