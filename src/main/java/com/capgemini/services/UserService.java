package com.capgemini.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.CustomerAlreadyExistsException;
import com.capgemini.exception.NoSuchPaymentExistsException;
import com.capgemini.exception.NoSuchUserException;
import com.capgemini.exception.UserAlreadyExistsException;
import com.capgemini.modules.Customer;
import com.capgemini.modules.Users;
import com.capgemini.repository.UserRepository;


@Service
public class UserService {

	@Autowired(required=true)
	UserRepository repository;
	
	public List<Users> getAllUsers(){
		return repository.findAll();
	}
	
	public Users getUsersById(long id)
	{
		return repository.findById(id).orElseThrow(()->new NoSuchUserException("No such user present with id="+id));
	}
	
	public Users addUsers( Users e)
	{
		Users exisitingUsers=repository.findById(e.getUserId()).orElse(null);
		if(exisitingUsers==null) {
			
			return repository.save(e);
			
		}
		else
		{
			throw new UserAlreadyExistsException("User already exist!!");
		}
		
	}
	
	
	
	public Users updateUsers(long id,Users e)
	{
		Users e1 = repository.findById(id).get();
		if(e1 !=null)
		{
			e1.setUserName( e.getUserName());
			e1.setPassword(e.getPassword());
					
			return repository.save(e1);
		}
		else
			return e1;
	}
	
	public void deleteUsers(long id)
	{
	Users e1 = repository.findById(id).get();
	
	if(e1 ==null)
	{
		System.out.println("The id value you entered is not there in table.So deliton is not possible");
	}
	else
		repository.delete(e1);
	    System.out.println("deletion sucessfull");
	}




}
