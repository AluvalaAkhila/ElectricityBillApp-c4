package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modules.Customer;

import com.repositories.CustomerDao;

@Service
public interface CustomerService {
	   public static final CustomerDao repository = null;
	  public default List<Customer> getAllCustomer(){
		  return repository.findAll();
		 }
}
