package com.capgemini.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.models.Customer;

public interface CustomerDao extends JpaRepository<Customer,Integer> {
}
