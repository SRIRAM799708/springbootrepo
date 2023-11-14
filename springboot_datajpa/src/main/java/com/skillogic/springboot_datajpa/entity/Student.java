package com.skillogic.springboot_datajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {

	@Id	
	@Column(name = "st_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name = "st_name")
	private String studentName;
	
	@Column(name = "st_avg")
	private double studentAvg;
	
	@Column(name="st_address")
	private String studentAddress;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentAvg() {
		return studentAvg;
	}

	public void setStudentAvg(double studentAvg) {
		this.studentAvg = studentAvg;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
}
	