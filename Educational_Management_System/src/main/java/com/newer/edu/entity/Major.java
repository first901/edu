package com.newer.edu.entity;

public class Major {
	private int id;
	private String name;
	private Institute institute;
	
	@Override
	public String toString() {
		return "Major [id=" + id + ", name=" + name + ", institute=" + institute + "]";
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
	public Institute getInstitute() {
		return institute;
	}
	public void setInstitute(Institute institute) {
		this.institute = institute;
	}
	
	
}
