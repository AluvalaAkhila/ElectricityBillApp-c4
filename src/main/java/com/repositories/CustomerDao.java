package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modules.Customer;

public interface CustomerDao extends JpaRepository<Customer,Integer> {

	


}
