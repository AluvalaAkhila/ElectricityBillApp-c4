package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.exception.IdAlreadyExistsException;
import com.capgemini.exception.IdNotFoundException;
import com.capgemini.modules.Bill;
import com.capgemini.modules.Customer;
import com.capgemini.repository.BillRepository;

@Service

public class BillService {
	
	@Autowired(required=true)
	BillRepository repository;
	
	
	public List<Bill> getAllBill(){
		return repository.findAll();
	}
	
	public Bill getBillById(long id)
	{
	return ( repository.findById(id).orElseThrow(()->new IdNotFoundException("No bill present with id="+id)));
	}
//	{
//		return repository.findById(id).get();
//	}
	
	public Bill addBill(Bill e) throws Exception {
		
		if(!(e.billId >= 10000000 && e.billId <= 99999999))
		{
			throw new Exception("Invalid billId, billId should be 8 digit");
		}
		
		if(!(e.billId >= 0))
		{
			throw new Exception("Invalid billAmount");
		}
		
		if(!(e.unitsConsumed >= 0 && e.unitsConsumed <= 100000))
		{
			throw new Exception("Invalid unitsConsumed, unitsConsumed should be in the range 0 to 100000");
		}
		
	Bill exisitingBill=repository.findById(e.getBillId()).orElse(null);
	if(exisitingBill==null) {
		
		return repository.save(e);
		
	}
	else
	{
		throw new IdAlreadyExistsException("Bill Id already exist!!");
	}
}
	
//	{
//		return repository.save(e);
//	}
	
		
	public Bill updateBill(long id,Bill e)
	{
		Bill e1 = repository.findById(id).get();
		if(e1 !=null)
		{
			e1.setUnitsConsumed( e.getUnitsConsumed());
			e1.setBillDate(e.getBillDate());
			e1.setBillDueDate(e.getBillDueDate());
			e1.setBillAmount(e.getBillAmount());
			e1.setBillForReading(e.getBillForReading());

					
			return repository.save(e1);
		}
		else
			return e1;
	}
	
	public void deleteBill(long id)
	{
	Bill e1 = repository.findById(id).get();
	
	if(e1 ==null)
	{
		System.out.println("The id value you entered is not there in table.So deliton is not possible");
	}
	else
		repository.delete(e1);
	    System.out.println("deletion sucessfull");
	}
////////////////////////////////////////////////////////////////////////////////////
//	public Bill ViewBillByEmail(String email) {
//		return repository.ViewBillByEmail(email);
//	}

}
