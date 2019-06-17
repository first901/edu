package com.newer.edu.entity;

import java.sql.Date;

public class Majorcourses {
	private int id;
	private Course course;
	private Class classx;
	private Date start;
	private Teacher teacher;
	private Classroom classroom;
	private String year;
	@Override
	public String toString() {
		return "Majorcourses [id=" + id + ", course=" + course + ", classx=" + classx + ", start=" + start
				+ ", teacher=" + teacher + ", classroom=" + classroom + ", year=" + year + "]";
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
	public Class getClassx() {
		return classx;
	}
	public void setClassx(Class classx) {
		this.classx = classx;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
