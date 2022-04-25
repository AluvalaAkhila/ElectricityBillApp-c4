package com.capgemini.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.IdNotFoundException;
import com.capgemini.modules.Address;
import com.capgemini.modules.Customer;
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
	public ResponseEntity<Address> getAddressById(@PathVariable long id) throws IdNotFoundException{
		return service.getAddressById(id);
	}
	
	
	@RequestMapping(value="/addaddress",method=RequestMethod.POST)
	public  Address addAddress( @RequestBody  Address e)
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

/////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping(value="/taluka/{Name}",method=RequestMethod.GET)
	public List<Address> getAllAddressByName(@PathVariable String Name)
	{
		return service.getAllAddressByName(Name);
	}
	@RequestMapping(value="/village/{village}",method=RequestMethod.GET)
	public List<Address> getAllAddressByVillage(@PathVariable String village)
	{
		return service.getAllAddressByVillage(village);
	}	
	@RequestMapping(value="/district/{district}",method=RequestMethod.GET)
	public List<Address> getAllAddressByDistrict(@PathVariable String district)
	{
		return service.getAllAddressByDistrict(district);
	}
	@RequestMapping(value="/pincode/{pincode}",method=RequestMethod.GET)
	public List<Address> getAllAddressByPincode(@PathVariable String pincode)
	{
		return service.getAllAddressByPincode(pincode);
	}
	
	@RequestMapping(value="/taluka/{taluka}",method=RequestMethod.GET)
	public List<Address> getAllAddressByTaluka(@PathVariable String taluka)
	{
		return service.getAllAddressByTaluka(taluka);
	}
	
}

