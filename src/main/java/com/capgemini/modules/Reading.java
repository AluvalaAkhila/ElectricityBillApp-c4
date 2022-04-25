package com.capgemini.modules;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;




@Entity

public class Reading {
@Id
public long readingId;
public int unitsConsumed;
public String readingPhoto;
private LocalDate readingDate;
public int pricePerUnits;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(referencedColumnName = "connectionId" , name="connectionid")
private Connection readingForConnection;

public Reading() {
}

public Reading(long readingId, int unitsConsumed, String readingPhoto, LocalDate readingDate, int pricePerUnits,
		Connection readingForConnection) {
	this.readingId = readingId;
	this.unitsConsumed = unitsConsumed;
	this.readingPhoto = readingPhoto;
	this.readingDate = readingDate;
	this.pricePerUnits = pricePerUnits;
	this.readingForConnection = readingForConnection;
}

public long getReadingId() {
	return readingId;
}

public void setReadingId(long readingId) {
	this.readingId = readingId;
}

public int getUnitsConsumed() {
	return unitsConsumed;
}

public void setUnitsConsumed(int unitsConsumed) {
	this.unitsConsumed = unitsConsumed;
}

public String getReadingPhoto() {
	return readingPhoto;
}

public void setReadingPhoto(String readingPhoto) {
	this.readingPhoto = readingPhoto;
}

public LocalDate getReadingDate() {
	return readingDate;
}

public void setReadingDate(LocalDate readingDate) {
	this.readingDate = readingDate;
}

public int getPricePerUnits() {
	return pricePerUnits;
}

public void setPricePerUnits(int pricePerUnits) {
	this.pricePerUnits = pricePerUnits;
}

public Connection getReadingForConnection() {
	return readingForConnection;
}

public void setReadingForConnection(Connection readingForConnection) {
	this.readingForConnection = readingForConnection;
}

@Override
public String toString() {
	return "Reading [readingId=" + readingId + ", unitsConsumed=" + unitsConsumed + ", readingPhoto=" + readingPhoto
			+ ", readingDate=" + readingDate + ", pricePerUnits=" + pricePerUnits + ", readingForConnection="
			+ readingForConnection + "]";
}








}
