package com.gl.fest.collegefest.dto;

public class UserRegistrationDto {

	private String f_name;
	private String l_name;
	private String email;
	private String password;

	public UserRegistrationDto(String f_name, String l_name, String email, String password) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.password = password;

	}
	
	public UserRegistrationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
