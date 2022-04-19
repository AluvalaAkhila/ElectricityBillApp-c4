package com.capgemini.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.models.Customer;

@Repository

public interface BillDao extends JpaRepository<Customer,Integer>{

}
