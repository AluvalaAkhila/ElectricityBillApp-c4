package com.capgemini.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.modules.Address;
import com.capgemini.services.AddressService;



@RestController
@RequestMapping("/ac")
public class AddressController {
	
	@Autowired(required=true)
	AddressService service;
	
	@RequestMapping(value="/address",method=RequestMethod.GET)
	public List<Address> getAllAddress()
	{
		return  service.getAllAddress();
	}
	
	@RequestMapping(value="/address/{id}",method=RequestMethod.GET)
	public Address getAddressById(@PathVariable long id)
	{
		return service.getAddressById(id);
	}
	
	
	@RequestMapping(value="/addaddress",method=RequestMethod.POST)
	public Address addAddress( @RequestBody  Address e)
	{
		return service.addAddress(e);
		
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Address updateAddress(@PathVariable long id,@RequestBody Address e)
	{
		return service.updateAddress(id,e);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void  deleteAddress(@PathVariable long id)
	{
		service.deleteAddress(id);
	}

	

}
