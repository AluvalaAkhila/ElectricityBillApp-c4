package com.capgemini.modules;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
 


public class Customer extends Users {
   
	@Id
	public long customerId;
    public long aadharNumber;
    @NotNull(message="This field should not be empty")
	@Pattern(regexp="[A-Z]{1}[A-Za-z]*",message="Invalid firstName, First letter should be caps")
	private	String firstName;
	@Pattern(regexp="[A-Z]{1}[A-Za-z]*",message="Invalid middleName, First letter should be caps")
	private String middleName;
	@Pattern(regexp="[A-Z]{1}[A-Za-z]*",message="Invalid lastName,4 First letter should be caps")
	private String lastName;
	@Email
	private String email;
	public long mobileNumber;
    public String gender;
	
	
	public Customer() {
	}


	public Customer(long customerId, long aadharNumber, String firstName, String middleName, String lastName,
			String email, long mobileNumber, String gender) {
		
		this.customerId = customerId;
		this.aadharNumber = aadharNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}


	public long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}


	public long getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", aadharNumber=" + aadharNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
}
