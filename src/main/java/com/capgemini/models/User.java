package com.capgemini.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class User {
	@Id
	private long userId;
	private String userName;
	private String password;
	
	public User() {
	}
	
	public User(long userId, String userName, String password) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}



	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	

}
