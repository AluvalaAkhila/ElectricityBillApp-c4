package com.capgemini.modules;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


@Entity

public class Bill {
	@Id
	@Min(value=7)
	@Max(value=7)
	private long billId;
	private LocalDate billDate;
	private LocalDate billDueDate;
	@Max(value=1000,message="unitsconsumed maximun value is 1000")
	private int unitsConsumed;
	@NotEmpty(message="billamount can not be empty")
	private int billAmount;
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "readingId" , name="readingid")
	private Reading billForReading;
	public Bill() {
	}
	public Bill(long billId, LocalDate billDate, LocalDate billDueDate, int unitsConsumed, int billAmount,
			Reading billForReading) {
		this.billId = billId;
		this.billDate = billDate;
		this.billDueDate = billDueDate;
		this.unitsConsumed = unitsConsumed;
		this.billAmount = billAmount;
		this.billForReading = billForReading;
	}
	public long getBillId() {
		return billId;
	}
	public void setBillId(long billId) {
		this.billId = billId;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public LocalDate getBillDueDate() {
		return billDueDate;
	}

	public void setBillDueDate(LocalDate billDueDate) {
		this.billDueDate = billDueDate;
	}

	public int getUnitsConsumed() {
		return unitsConsumed;
	}

	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public Reading getBillForReading() {
		return billForReading;
	}

	public void setBillForReading(Reading billForReading) {
		this.billForReading = billForReading;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billDate=" + billDate + ", billDueDate=" + billDueDate + ", unitsConsumed="
				+ unitsConsumed + ", billAmount=" + billAmount + ", billForReading=" + billForReading + "]";
	}
	
	
	
	
	

}
