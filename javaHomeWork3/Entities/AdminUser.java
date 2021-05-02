package Entities;

import Ýnterfaces.Entity;

public class AdminUser implements Entity {
	private int id;
	private String fisrtName;
	private  String lastName;
	public AdminUser(int id, String fisrtName, String lastName) {
		super();
		this.id = id;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
	}
	public AdminUser() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
