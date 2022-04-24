package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.modules.Bill;
import com.capgemini.modules.Customer;
@Repository

public interface BillRepository extends JpaRepository<Bill , Long>{
	
	
	@Query(value="select e from Bill e where e.firstName=?1")
	   public List<Bill> getAllCustomerByName3(@Param("firstName")String Name);

}
