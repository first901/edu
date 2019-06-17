package com.newer.edu.entity;

public class Requiredcourses {
	private int id;
	private Course course;
	private Student student;
	private String ugrades;
	private String tgrades;
	private String grades;
	private String examination;
	private String reset;
	@Override
	public String toString() {
		return "Requiredcourses [id=" + id + ", course=" + course + ", student=" + student + ", ugrades=" + ugrades
				+ ", tgrades=" + tgrades + ", grades=" + grades + ", examination=" + examination + ", reset=" + reset
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getUgrades() {
		return ugrades;
	}
	public void setUgrades(String ugrades) {
		this.ugrades = ugrades;
	}
	public String getTgrades() {
		return tgrades;
	}
	public void setTgrades(String tgrades) {
		this.tgrades = tgrades;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public String getExamination() {
		return examination;
	}
	public void setExamination(String examination) {
		this.examination = examination;
	}
	public String getReset() {
		return reset;
	}
	public void setReset(String reset) {
		this.reset = reset;
	}
	
}
