package com.capgemini.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Address {
	@Id
	private long addressId;
	private int faltOrHouseNumber;
	private String buildingName;
	private String landmark;
	private String village;
	private String taluka;
	private String district;
	private String state;
	private String pincode;
	
	public Address() {
	}

	public Address(long addressId, int faltOrHouseNumber, String buildingName, String landmark, String village,
			String taluka, String district, String state, String pincode) {
		this.addressId = addressId;
		this.faltOrHouseNumber = faltOrHouseNumber;
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

	public int getFaltOrHouseNumber() {
		return faltOrHouseNumber;
	}

	public void setFaltOrHouseNumber(int faltOrHouseNumber) {
		this.faltOrHouseNumber = faltOrHouseNumber;
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
		return "Address [addressId=" + addressId + ", faltOrHouseNumber=" + faltOrHouseNumber + ", buildingName="
				+ buildingName + ", landmark=" + landmark + ", village=" + village + ", taluka=" + taluka
				+ ", district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	

}
