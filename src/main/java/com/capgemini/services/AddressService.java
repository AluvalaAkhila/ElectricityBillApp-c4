package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.exception.IdAlreadyExistsException;
import com.capgemini.exception.IdNotFoundException;
import com.capgemini.modules.Address;
import com.capgemini.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired(required=true)
	AddressRepository repository;
	
	public List<Address> getAllAddress(){
		return repository.findAll();
	}
	
	
	public ResponseEntity<Address> getAddressById(long id)throws IdNotFoundException{
	
		Address ad= repository.findById(id)
				.orElseThrow(()->new IdNotFoundException("address id doesnot exists::"+id));
		return ResponseEntity.ok().body(ad);
	}
	
	public Address addAddress( Address e) throws Exception
	{
		if(!(e.addressId >= 100000 && e.addressId <= 999999))
		{
			throw new Exception("Invalid addressId, addressId should be 6 digit");
		}
		
		if(!(e.flatOrHouseNumber > 0 && e.addressId < 1000))
		{
			throw new Exception("Invalid flatOrHouseNumber, flatOrHouseNumber should be less than 1000");
		}
		
		 Address exisitingAddress=repository.findById(e.getAddressId()).orElse(null);
		if(exisitingAddress==null) 
		{
			
			return repository.save(e);
			
		}
		else
		{
			throw new IdAlreadyExistsException("Address Id already exist!!");
		}
		
	}	
	public Address updateAddress(long id,Address e)
	{
		Address e1 = repository.findById(id).get();
		if(e1 !=null)
		{
			e1.setFlatOrHouseNumber( e.getFlatOrHouseNumber());
			e1.setBuildingName(e.getBuildingName());
			e1.setLandmark(e.getLandmark());
			e1.setVillage(e.getVillage());
			e1.setTaluka(e.getTaluka());
			e1.setDistrict(e.getDistrict());
			e1.setState(e.getState());
			e1.setDistrict(e.getDistrict());
					
			return repository.save(e1);
		}
		else
			return e1;
	}
	public void deleteAddress(long id)
	{
	Address e1 = repository.findById(id).get();
	
	if(e1 ==null)
	{
		System.out.println("The id value you entered is not there in table.So deliton is not possible");
	}
	else
		repository.delete(e1);
	    System.out.println("deletion sucessfull");
	}

//////////////////////////////////////////////////////////////////////////////////////////////
	

}