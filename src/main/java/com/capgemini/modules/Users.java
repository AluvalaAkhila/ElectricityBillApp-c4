package com.capgemini.modules;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;







@MappedSuperclass
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public class Users {


	
	public long userId;
	@NotNull(message="This field should not be empty")
	@Pattern(regexp="[A-Z]{1}[A-Za-z]*",message="invalid userName, First letter should be caps ")
	private String userName;
	@NotNull(message="This field should not be empty")
	@Pattern(regexp="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[$@#*\\/&!¿?¡+%()=-])(.{8,})",message="invalid password,it should have one uppercase one lowercase one special character one number")
	private String password;
	
	public Users() {
	}
	
	public Users(long userId, String userName, String password) {
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
