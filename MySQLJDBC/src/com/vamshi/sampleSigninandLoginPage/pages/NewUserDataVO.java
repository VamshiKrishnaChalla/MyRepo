package com.vamshi.sampleSigninandLoginPage.pages;

public class NewUserDataVO {
	
	private String name;
	private String role;
	private String userName;
	private String pass;
	
	
	public NewUserDataVO(String name, String role, String userName, String pass) {
		this.name = name;
		this.role = role;
		this.userName = userName;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	

}
