package com.newer.edu.entity;

public class Classroom {
	private int id;
	private String address;
	private String type;
	private int max;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	@Override
	public String toString() {
		return "Classroom [id=" + id + ", address=" + address + ", type=" + type + ", max=" + max + "]";
	}
	
}
