package com.example.formvalidation.entity;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message="UserName cannot be empty!!")
	@Size(min=3, max=10,message="Username must be 3-10 cahracters !!!")
	private String userName;
	
	@NotBlank(message="Email cannot be empty!!")
	@Pattern(regexp="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@gmail.com+$", message="please enter a valid email id !!!")
	private String email;
	@AssertTrue(message="Please agree the terms & conditions!!")
	private boolean agreed;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
	public String toString() {
		return "Form [userName=" + userName + ", email=" + email + "]";
	}
	
	

}
