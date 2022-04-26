package com.capgemini.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.modules.Customer;
import com.capgemini.services.CustomerService;

@RestController
@RequestMapping("/cc")
public class CustomerController {
	
	@Autowired(required=true)
	CustomerService service;
	
	@RequestMapping(value="/customer",method=RequestMethod.GET)
	public List<Customer> getAllCustomer()
	{
		return  service.getAllCustomer();
	}
	
	@RequestMapping(value="/customer/{id}",method=RequestMethod.GET)
	public Customer getCustomerById(@PathVariable long id)
	{
		return service.getCustomerById(id);
	}
	
	
	@RequestMapping(value="/addcustomer",method=RequestMethod.POST)
	public Customer addCustomer( @RequestBody  Customer e) throws Exception
	{
		return service.addCustomer(e);
		
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Customer updateCustomer(@PathVariable long id,@RequestBody Customer e)
	{
		return service.updateCustomer(id,e);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void  deleteCustomer(@PathVariable long id)
	{
		service.deleteCustomer(id);
	}
///////////////////////////////////////////////////
	
	@RequestMapping(value="/user/{name}",method=RequestMethod.GET)
	public Customer searchUserByUserName(@PathVariable String name)
	{
		return service.searchUserByUserName(name);
	}
	
	@RequestMapping(value="/mobile/{name1}",method=RequestMethod.GET)
	public Customer searchCustomerByMobile(@PathVariable String name1)
	{
		return service.searchCustomerByMobile(name1);
	}
	@RequestMapping(value="/email/{name2}",method=RequestMethod.GET)
	public Customer searchCustomerByEmail(@PathVariable String name2)
	{
		return service.searchCustomerByEmail(name2);
	}
	@RequestMapping(value="/userid/{id}",method=RequestMethod.GET)
	public Customer searchUserByUserId(@PathVariable Long id)
	{
		return service.searchUserByUserId(id);
	}
	@RequestMapping(value="/aadhar/{Number}",method=RequestMethod.GET)
	public Customer SearchCustomerByAadhar(@PathVariable Long Number)
	{
		return service.SearchCustomerByAadhar(Number);
	}
	@RequestMapping(value="/firstName/{Name}",method=RequestMethod.GET)
	public List<Customer> SearchCustomerByName(@PathVariable String Name)
	{
		return service.SearchCustomerByName(Name);
	}

	
}
