//package com.capgemini.services;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.capgemini.modules.Address;
//import com.capgemini.repository.AddressRepository;
//
//@Service
//public class AddressService {
//
//	@Autowired(required=true)
//	AddressRepository repository;
//	
//	public List<Address> getAllAddress(){
//		return repository.findAll();
//	}
//	
//	public Address getAddressById(int id)
//	{
//		return repository.findById(id).get();
//	}
//	
//	public Address addAddress( Address e)
//	{
//		return repository.save(e);
//	}
//	
//	
//	
//	public Address updateAddress(int id,Address e)
//	{
//		Address e1 = repository.findById(id).get();
//		if(e1 !=null)
//		{
//			e1.setFaltOrHouseNumber( e.getFaltOrHouseNumber());
//			e1.setBuildingName(e.getBuildingName());
//			e1.setLandmark(e.getLandmark());
//			e1.setVillage(e.getVillage());
//			e1.setTaluka(e.getTaluka());
//			e1.setDistrict(e.getDistrict());
//			e1.setState(e.getState());
//			e1.setDistrict(e.getDistrict());
//					
//			return repository.save(e1);
//		}
//		else
//			return e1;
//	}
//	
//	public void deleteAddress(int id)
//	{
//	Address e1 = repository.findById(id).get();
//	
//	if(e1 ==null)
//	{
//		System.out.println("The id value you entered is not there in table.So deliton is not possible");
//	}
//	else
//		repository.delete(e1);
//	    System.out.println("deletion sucessfull");
//	}
//
//
//
//}
//
//
