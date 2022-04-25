package com.capgemini.modules;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;

import org.springframework.beans.factory.annotation.Autowired;

@Entity



public class Payment {
	
	@Id
	public long paymentId;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "billId" , name="billid")
	private Bill bill;
	
	private LocalDate paymentDate;
	
	@Autowired
	private PaymentMode paymentMode;
	
	@Max(value=1000,message= "if latepayment charges exceeds 1000 then current will be cutoff from thier respective building")
	private double latePaymentCharges;
	public double totalPaid;
	
	@Autowired
	private PaymentStatus status;
	
	public Payment() {
	}

	public Payment(long paymentId, Bill bill, LocalDate paymentDate, PaymentMode paymentMode, double latePaymentCharges,
			double totalPaid, PaymentStatus status) {
		this.paymentId = paymentId;
		this.bill = bill;
		this.paymentDate = paymentDate;
		this.paymentMode = paymentMode;
		this.latePaymentCharges = latePaymentCharges;
		this.totalPaid = totalPaid;
		this.status = status;
	}
	
	

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public double getLatePaymentCharges() {
		return latePaymentCharges;
	}

	public void setLatePaymentCharges(double latePaymentCharges) {
		this.latePaymentCharges = latePaymentCharges;
	}

	public double getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", bill=" + bill + ", paymentDate=" + paymentDate + ", paymentMode="
				+ paymentMode + ", latePaymentCharges=" + latePaymentCharges + ", totalPaid=" + totalPaid + ", status="
				+ status + "]";
	}
	
	

	
}
