package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.models.Customer;
import com.capgemini.services.CustomerService;

	@RestController
	//@RequestMapping("/Customer")
	public class CustomerController {
	@Autowired(required=true)
	CustomerService service;
	@RequestMapping(value="/retrieves",method=RequestMethod.GET)
	public List<Customer> getAllCustomer(){
	return ((CustomerController) service).getAllCustomer();
	}
}
