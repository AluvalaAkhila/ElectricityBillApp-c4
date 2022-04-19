package com.capgemini.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.modules.Users;
import com.capgemini.services.UserService;

@RestController

public class UserController {
	
	@Autowired(required=true)
	UserService service;
	
	
	
	

}
