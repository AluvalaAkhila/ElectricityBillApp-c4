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

}
