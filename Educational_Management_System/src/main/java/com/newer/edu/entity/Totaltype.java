package com.newer.edu.entity;

public class Totaltype {
	private int id;
	private String type;
	@Override
	public String toString() {
		return "Totaltype [id=" + id + ", type=" + type + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
