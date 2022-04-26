package com.cg;

import static org.junit.Assert.assertEquals;
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

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTesting {
@MockBean
private CustomerRepository repository;
@Autowired
private CustomerService service;
public void getAllCustomerTest() {
	when( repository.findAll()).thenReturn( Stream.of(new Customer(10350,101002345,"Rama","devi","patel","Rama@gmail.com","95487912300","female")).collect(Collectors.toList()));
assertEquals(2,service.getAllCustomer().size());
}

}

