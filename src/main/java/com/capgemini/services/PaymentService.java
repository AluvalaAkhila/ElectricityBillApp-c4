package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.CustomerAlreadyExistsException;
import com.capgemini.exception.NoSuchCustomerExistsException;
import com.capgemini.exception.NoSuchPaymentExistsException;
import com.capgemini.exception.PaymentAlreadyExistsException;
import com.capgemini.exception.UserAlreadyExistsException;
import com.capgemini.modules.Address;
import com.capgemini.modules.Customer;
import com.capgemini.modules.Payment;
import com.capgemini.modules.Users;
import com.capgemini.repository.AddressRepository;
import com.capgemini.repository.PaymentRepository;


@Service
public class PaymentService {
	@Autowired(required=true)
PaymentRepository repository;
	
	public List<Payment> getAllPayment(){
		return repository.findAll();
	}
	
	public Payment getPaymentById(long id)
	{
		return repository.findById(id).orElseThrow(()->new NoSuchPaymentExistsException("No payment present with id="+id));
	}
	
	public Payment addPayment( Payment p)
	{
		Payment exisitingPayment=repository.findById(p.getPaymentId()).orElse(null);
		if(exisitingPayment==null) {
			
			return repository.save(p);
			
		}
		else
		{
			throw new PaymentAlreadyExistsException("payment already exist!!");
		}
			
	}
	public Payment updatePayment(long id,Payment p)
	{
		Payment p1 = repository.findById(id).get();
		if(p1 !=null)
		{
			p1.setBill( p.getBill());
		p1.setPaymentDate(p.getPaymentDate());
		p1.setPaymentMode(p.getPaymentMode());
		p1.setLatePaymentCharges(p.getLatePaymentCharges());
		p1.setTotalPaid(p.getTotalPaid());
		p1.setStatus(p.getStatus());		
		return repository.save(p1);
	}
	else
		return p1;
}
	public void deletePayment(long id)
	{
	Payment p1 = repository.findById(id).get();
	
	if(p1 ==null)
	{
		System.out.println("The id value you entered is not there in table.So deliton is not possible");
	}
	else
		repository.delete(p1);
	    System.out.println("deletion sucessfull");
	}



}
	
	
	