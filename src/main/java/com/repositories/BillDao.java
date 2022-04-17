package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modules.Customer;

@Repository
public interface BillDao extends JpaRepository<Customer,Integer>{

}
