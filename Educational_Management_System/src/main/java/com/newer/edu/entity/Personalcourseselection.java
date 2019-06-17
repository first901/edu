package com.newer.edu.entity;

public class Personalcourseselection {
	private int id;
	private Student student;
	private Arranging arranging;
	@Override
	public String toString() {
		return "Personalcourseselection [id=" + id + ", student=" + student + ", arranging=" + arranging + "]";
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
	public Arranging getArranging() {
		return arranging;
	}
	public void setArranging(Arranging arranging) {
		this.arranging = arranging;
	}
	
}
