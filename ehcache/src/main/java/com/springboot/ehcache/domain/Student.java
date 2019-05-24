package com.springboot.ehcache.domain;

public class Student {
	private Integer id;
	private String name;
	private String regdNo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegdNo() {
		return regdNo;
	}

	public void setRegdNo(String regdNo) {
		this.regdNo = regdNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", regdNo=" + regdNo + "]";
	}
	

}
