package com.capgemini.modules;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="address")
public class Address {
	@Id
	//@Digits(integer=5,fraction=0,message="addressId is only 5digits")
	@Range(max=99999,min=10000,message="AddressId must be 5 digits")
	private long addressId;

	@Digits(integer=8,fraction=0,message="flatno is exceeded 8digits")
	private int flatOrHouseNumber;
	@Pattern(regexp="[A-Za-z_]*",message="invalid symbols")
	//@Pattern(regexp="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[$@#*\\/&!¿?¡+%()=-])(.{8,})",message="give valid password")
	private String buildingName;
	@Pattern(regexp="[a-zA-Z0-9]*",message="invalid special chars")
	private String landmark;
	@Pattern(regexp="[A-Za-z_]*",message="invalid symbolsare not allowed village")
	private String village;
	@Pattern(regexp="[A-Za-z0-9]*",message="invalid symbols in taluka")
	private String taluka;
	@Pattern(regexp="[A-Z]{1}[A-Za-z]*",message="invalid sentence format,please start with uppercase")
	private String district;
	@Pattern(regexp="[A-Z]{1}[A-Za-z]*",message="invalid sentence format,please start with uppercase")
	private String state;
	@Pattern(regexp="[0-9]{6}",message="only numbers are allowed in pincode")
	private String pincode;
	
	public Address() {
	}

	public Address(long addressId, int flatOrHouseNumber, String buildingName, String landmark, String village,
			String taluka, String district, String state, String pincode) {
		this.addressId = addressId;
		this.flatOrHouseNumber = flatOrHouseNumber;
		this.buildingName = buildingName;
		this.landmark = landmark;
		this.village = village;
		this.taluka = taluka;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public int getFlatOrHouseNumber() {
		return flatOrHouseNumber;
	}

	public void setFlatOrHouseNumber(int flatOrHouseNumber) {
		this.flatOrHouseNumber = flatOrHouseNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", flatOrHouseNumber=" + flatOrHouseNumber + ", buildingName="
				+ buildingName + ", landmark=" + landmark + ", village=" + village + ", taluka=" + taluka
				+ ", district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	
		
	}

}
