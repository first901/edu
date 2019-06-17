package com.newer.edu.entity;

public class Class {
	private int id;
	private String name;
	private  int number;
	private Major major;
	private Teacher teacher;
	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", number=" + number + ", major=" + major + ", teacher=" + teacher
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
