package com.newer.edu.entity;

import java.sql.Date;

public class Arranging {
	private int id;
	private Course course;
	private  int maxpeop;
	private Totaltype totaltype;
	private Date start;
	private Teacher teacher;
	private Classroom classroom;
	private String year;
	@Override
	public String toString() {
		return "Arranging [id=" + id + ", course=" + course + ", maxpeop=" + maxpeop + ", totaltype=" + totaltype
				+ ", start=" + start + ", teacher=" + teacher + ", classroom=" + classroom + ", year=" + year + "]";
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
	public int getMaxpeop() {
		return maxpeop;
	}
	public void setMaxpeop(int maxpeop) {
		this.maxpeop = maxpeop;
	}
	public Totaltype getTotaltype() {
		return totaltype;
	}
	public void setTotaltype(Totaltype totaltype) {
		this.totaltype = totaltype;
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
