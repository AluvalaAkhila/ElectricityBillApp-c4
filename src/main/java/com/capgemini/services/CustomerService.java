

package com.capgemini.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.CustomerAlreadyExistsException;
import com.capgemini.exception.NoSuchCustomerExistsException;
import com.capgemini.modules.Customer;
import com.capgemini.repository.CustomerRepository;

@Service

public class CustomerService {
	
	@Autowired(required=true)
	CustomerRepository repository;
	
	public List<Customer> getAllCustomer(){
		return repository.findAll();
	}
	
	public Customer getCustomerById(long id)
	{
		return ( repository.findById(id).orElseThrow(()->new NoSuchCustomerExistsException("No customer present with id="+id)));
	}
	
	public Customer addCustomer( Customer e)
	{
		Customer exisitingCustomer=repository.findById(e.getCustomerId()).orElse(null);
		if(exisitingCustomer==null) {
			
			return repository.save(e);
			
		}
		else
		{
			throw new CustomerAlreadyExistsException("Customer already exist!!");
		}
		
	}
	
	
	
	public Customer updateCustomer(long id,Customer e)
	{
		Customer e1 = repository.findById(id).get();
		if(e1 !=null)
		{
	
			e1.setAadharNumber(e.getAadharNumber());
			e1.setFirstName(e.getFirstName());
			e1.setMiddleName(e.getMiddleName());
			e1.setLastName(e.getLastName());
			e1.setEmail(e.getEmail());
			e1.setMobileNumber(e.getMobileNumber());
			e1.setGender(e.getGender());
					
			return repository.save(e1);
		}
		else
			return e1;
	}
	
	public void deleteCustomer(long id)
	{
	Customer e1 = repository.findById(id).get();
	
	if(e1 ==null)
	{
		System.out.println("The id value you entered is not there in table.So deliton is not possible");
	}
	else
		repository.delete(e1);
	    System.out.println("deletion sucessfull");
	}
}
