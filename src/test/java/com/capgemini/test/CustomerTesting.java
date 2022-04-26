package com.capgemini.test;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.modules.Customer;
import com.capgemini.repository.CustomerRepository;
import com.capgemini.services.CustomerService;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTesting {
	
	@MockBean
	private  CustomerRepository repository;
	@Autowired
	private  CustomerService service;
	
	public void getAllCustomerTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Customer(103,100,"bobby","7708523388","sahana","patil","123","543"), new Customer(1033,10042,"bobby4","77085233886","sahanap","patil1","1236","5431")).collect(Collectors.toList()));
		assertEquals(2,service.getAllCustomer().size());
	}

}
