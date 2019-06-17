package com.newer.edu.entity;

/**
 * 学院表 institute
 * @author Administrator
 *
 */
public class Institute {
	private int id;
	private String name;
	private String prexy;
	
	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", prexy=" + prexy + "]";
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
	public String getPrexy() {
		return prexy;
	}
	public void setPrexy(String prexy) {
		this.prexy = prexy;
	}
	
}
