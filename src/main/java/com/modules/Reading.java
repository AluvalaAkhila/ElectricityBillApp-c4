package com.modules;

import java.time.LocalDate;

public class Reading {
private long readingId;
private int unitsConsumed;
private String readingPhoto;
private LocalDate readingDate;
private int pricePerUnits;
private int unitsCustomerId;
public long getReadingId() {
	return readingId;
}
public void setReadingId(long readingId) {
	this.readingId = readingId;
}
public int getUnitsCustomerId() {
	return getUnitsCustomerId();
}

public int getUnitsConsumed() {
	return unitsConsumed;
}
public void setUnitsConsumed(int unitsConsumed) {
	this.unitsConsumed = unitsConsumed;
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

}
