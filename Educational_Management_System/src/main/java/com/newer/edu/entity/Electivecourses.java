package com.newer.edu.entity;

public class Electivecourses {
	private int id;
	private Student student;
	private Personalcourseselection personalcourseselection;
	private String grade;
	@Override
	public String toString() {
		return "Requiredcourses [id=" + id + ", student=" + student + ", personalcourseselection="
				+ personalcourseselection + ", grade=" + grade + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Personalcourseselection getPersonalcourseselection() {
		return personalcourseselection;
	}
	public void setPersonalcourseselection(Personalcourseselection personalcourseselection) {
		this.personalcourseselection = personalcourseselection;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
