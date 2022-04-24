package com.repositories;
import java.time.LocalDate;
import java.util.List;
import com.capgemini.model.Bill;



public interface BillDao 
{
	public Bill readBillByConsumerNumber(Long consumerNumber);
	public Bill readBillByMobileNumber(String mobile);
	public Bill readBillByEmail(String email);
	public List<Bill> readBillForDateRange(LocalDate from, LocalDate to);

}
