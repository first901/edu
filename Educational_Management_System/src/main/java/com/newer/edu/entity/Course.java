package com.newer.edu.entity;

public class Course {
	private int id;
	private String name;
	private int credit;
	private Totaltype totaltype;
	private Major major;
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", credit=" + credit + ", totaltype=" + totaltype + ", major="
				+ major + "]";
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
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Totaltype getTotaltype() {
		return totaltype;
	}
	public void setTotaltype(Totaltype totaltype) {
		this.totaltype = totaltype;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	
}
