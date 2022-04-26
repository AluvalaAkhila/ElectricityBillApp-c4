

package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.IdAlreadyExistsException;
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
	public Customer addCustomer( Customer e) throws Exception
	{
		if(!(e.userId >= 10000 && e.userId <= 99999))
		{
			throw new Exception("Invalid UserId, userId should be 5 digit");
		}
		if(!(e.customerId >= 1000000 && e.customerId <= 9999999))
		{
			throw new Exception("Invalid customerId, customerId should be 7 digit");
		}
		if(!(String.valueOf(e.aadharNumber).length() == 12))
		{
			throw new Exception("Invalid aadharNumber, aadharNumber should be 12 digit");
		}
		if(!(String.valueOf(e.mobileNumber).length() == 10))
		{
			throw new Exception("Invalid mobileNumber, mobileNumber should be 10 digit");
		}
		
		if(!e.gender.equalsIgnoreCase("Male") && !e.gender.equalsIgnoreCase("Female") && !e.gender.equalsIgnoreCase("Others"))
		{
			throw new Exception("Invalid gender");
		}
		
		
			Customer exisitingCustomer=repository.findById(e.getCustomerId()).orElse(null);
			if(exisitingCustomer==null) {
				
				return repository.save(e);
				
			}
			else
			{
				throw new IdAlreadyExistsException("Customer already exist with this Id!!");
			}
		}	
	
//	public Customer addCustomer( Customer e)
//	{
//		Customer exisitingCustomer=repository.findById(e.getCustomerId()).orElse(null);
//		if(exisitingCustomer==null) {
//			
//			return repository.save(e);
//			
//		}
//		else
//		{
//			throw new IdAlreadyExistsException("Customer already exist with this Id!!");
//		}
//		
//	}
//	
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////
public Customer getCustomerByName(String name)
{
	return repository.getCustomerByName(name);
}

public Customer getCustomerByName1(String name1)
{
	return repository.getCustomerByName1(name1);
}
//public Customer getCustomerByName2(String name2)
//{
//	return repository.getCustomerByName2(name2);
//}
public Customer getCustomerById3(Long id)
{
	return repository.getCustomerById3(id);
}
public Customer getCustomerByNumber(Long Number)
{
	return repository.getCustomerByNumber(Number);
}
public List<Customer> getAllCustomerByName3(String Name)
{
	return repository.getAllCustomerByName3(Name);
}
}