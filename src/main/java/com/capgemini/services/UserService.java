package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.modules.Users;
import com.capgemini.repository.UserRepository;


@Service
public class UserService {

	@Autowired(required=true)
	UserRepository repository;
	
	public List<Users> getAllUsers(){
		return repository.findAll();
	}
	
	public Users getUsersById(int id)
	{
		return repository.findById(id).get();
	}
	
	public Users addUsers( Users e)
	{
		return repository.save(e);
	}
	
	
	
	public Users updateUsers(int id,Users e)
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
	
	public void deleteUsers(int id)
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
