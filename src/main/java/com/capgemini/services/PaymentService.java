
package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.IdAlreadyExistsException;
import com.capgemini.exception.IdNotFoundException;
import com.capgemini.modules.Payment;
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
		return ( repository.findById(id).orElseThrow(()->new IdNotFoundException("No Payment present with id="+id)));
		}
//	{
//		return repository.findById(id).get();
//	}
	public Payment addPayment( Payment p) throws Exception {
		
		if(!(p.paymentId >= 1000 && p.paymentId <= 9999))
		{
			throw new Exception("Invalid paymentId, paymentId should be 4 digit");
		}
		
		if(!(p.totalPaid >= 0))
		{
			throw new Exception("Invalid totalPaid,some Amount should be paid definitely");
		}
		
		Payment exisitingPayment=repository.findById(p.getPaymentId()).orElse(null);
		if(exisitingPayment==null) {
			
			return repository.save(p);
			
		}
		else
		{
			throw new IdAlreadyExistsException("Payment Id already exist!!");
		}
	
	}
//	{
//		return repository.save(p);
//	}
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
	
	
	