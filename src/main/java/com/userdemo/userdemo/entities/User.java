package com.userdemo.userdemo.entities;

public class User {
	private long id;
	private String name;
	private String email;
	private int number;

	public User(long id, String name, String email, int number) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
