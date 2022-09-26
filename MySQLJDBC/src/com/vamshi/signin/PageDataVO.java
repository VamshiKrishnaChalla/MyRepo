package com.vamshi.signin;

public class PageDataVO {

	private String Email;
	private char[] password;
	private boolean loginOption;
	private boolean signupOption;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] cs) {
		this.password = cs;
	}
	public boolean isLoginOption() {
		return loginOption;
	}
	public void setLoginOption(boolean loginOption) {
		this.loginOption = loginOption;
	}
	public boolean isSignupOption() {
		return signupOption;
	}
	public void setSignupOption(boolean signupOption) {
		this.signupOption = signupOption;
	}
	
}
