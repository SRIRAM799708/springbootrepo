package com.skillogic.springboot_datajpa.service;

import java.util.List;

import com.skillogic.springboot_datajpa.entity.Student;

public interface IStudentService {
	public int saveStudent(Student st);
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public void deleteStudentById(int id);
	public void updateStudent(Student st);
}
