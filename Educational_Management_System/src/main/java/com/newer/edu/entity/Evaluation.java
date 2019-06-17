package com.newer.edu.entity;

public class Evaluation {
	private int id;
	private Student student;
	private Course course;
	@Override
	public String toString() {
		return "Evaluation [id=" + id + ", student=" + student + ", course=" + course + "]";
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
