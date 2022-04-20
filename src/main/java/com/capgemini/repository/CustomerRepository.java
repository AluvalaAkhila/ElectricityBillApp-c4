package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.modules.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer , Long> {

}
