package com.newer.edu.entity;

import java.sql.Date;

public class Discipline {
	private int id;
	private Student student;
	private Date date;
	private Disciplinetype disciplinetype;
	private String reason;
	@Override
	public String toString() {
		return "Discipline [id=" + id + ", student=" + student + ", date=" + date + ", disciplinetype=" + disciplinetype
				+ ", reason=" + reason + "]";
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Disciplinetype getDisciplinetype() {
		return disciplinetype;
	}
	public void setDisciplinetype(Disciplinetype disciplinetype) {
		this.disciplinetype = disciplinetype;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
