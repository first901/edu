package com.newer.edu.entity;

public class Gradepoint {
	private int id;
	private String grade;
	private Double gba;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Double getGba() {
		return gba;
	}
	public void setGba(Double gba) {
		this.gba = gba;
	}
	@Override
	public String toString() {
		return "Gradepoint [id=" + id + ", grade=" + grade + ", gba=" + gba + "]";
	}
  
}
