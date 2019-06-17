package com.newer.edu.entity;

import java.sql.Date;

public class Student {
	private int id;
	private String name;
	private String gender;
	private Date birthday;
	private Class classx;
	private String period;
	private Major major;
	private String  account;
	private String password;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Class getClassx() {
		return classx;
	}
	public void setClassx(Class classx) {
		this.classx = classx;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", classx="
				+ classx + ", period=" + period + ", major=" + major + ", account=" + account + ", password=" + password
				+ "]";
	}
	
	
}
