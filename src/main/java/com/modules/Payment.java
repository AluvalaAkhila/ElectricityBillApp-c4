package com.modules;

import java.time.LocalDate;

public class Payment {
	
	private long paymentId;
	private Bill bill;
	private LocalDate paymentDate;
	private PaymentMode paymentMode;
	private double latePaymentCharges;
	private double totalPaid;
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

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", bill=" + bill + ", paymentDate=" + paymentDate + ", paymentMode="
				+ paymentMode + ", latePaymentCharges=" + latePaymentCharges + ", totalPaid=" + totalPaid + ", status="
				+ status + "]";
	}
	
	

	
}
