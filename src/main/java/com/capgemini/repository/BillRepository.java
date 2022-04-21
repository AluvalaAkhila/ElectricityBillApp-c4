package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.modules.Bill;
@Repository

public interface BillRepository extends JpaRepository<Bill , Long>{

}
