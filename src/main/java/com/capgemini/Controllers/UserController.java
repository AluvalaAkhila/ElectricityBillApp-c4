package com.capgemini.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.modules.Users;
import com.capgemini.services.UserService;

@RestController
@RequestMapping("/uc")

public class UserController {
	
	@Autowired(required=true)
	UserService service;
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<Users> getAllUsers()
	{
		return  service.getAllUsers();
	}
	
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public Users getStudentById(@PathVariable long id)
	{
		return service.getUsersById(id);
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Users addUsers( @RequestBody  Users e)
	{
		return service.addUsers(e);
		
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Users updateStudent(@PathVariable long id,@RequestBody Users e)
	{
		return service.updateUsers(id,e);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void  deleteStudent(@PathVariable long id)
	{
		service.deleteUsers(id);
	}

	

	
	
	
	

}
