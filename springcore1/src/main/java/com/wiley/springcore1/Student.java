package com.wiley.springcore1;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Student {
	private int studentID;
	private String studentName;
	private String studentAddress;
	private List marks;
	private Set subjects;
	private HashMap duration;
	private Properties prop;
	private Address ad;
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Set getSubjects() {
		return subjects;
	}
	public void setSubjects(Set subjects) {
		this.subjects = subjects;
	}
	public HashMap getDuration() {
		return duration;
	}
	public void setDuration(HashMap duration) {
		this.duration = duration;
	}
	public List getMarks() {
		return marks;
	}
	public void setMarks(List marks) {
		this.marks = marks;
	}
	public Student() {
		
	}
	public Student(int studentID, String studentName, String studentAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", marks=" + marks + ", subjects=" + subjects + ", duration=" + duration + ", prop=" + prop + ", ad="
				+ ad + "]";
	}
}

