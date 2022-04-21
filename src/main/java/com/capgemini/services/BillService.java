package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.modules.Bill;
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
		return repository.findById(id).get();
	}
	
	public Bill addBill(Bill e)
	{
		return repository.save(e);
	}
	
	
	
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

}
