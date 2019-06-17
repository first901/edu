package com.newer.edu.entity;

public class Deansoffic {
	private int id;
	private String account;
	private String password;
	
	@Override
	public String toString() {
		return "deansoffic [id=" + id + ", account=" + account + ", password=" + password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
