package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.modules.Bill;
import com.capgemini.modules.Customer;
@Repository

public interface BillRepository extends JpaRepository<Bill , Long>{

//	@Query(value="")
//	   public Bill ViewBillByEmail(@Param("email")String email);
}
