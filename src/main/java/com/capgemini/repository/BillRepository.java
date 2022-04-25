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
	
	
	@Query("select e from Bill e where e.consumerNumber=?1")
	public List<Bill> getAllBillByConsumerNumber(@Param("consumerNumber")Long consumerNumber);
	
	
	@Query("select e from Bill e where e.email=?1")
	public List<Bill> getAllBillByEmail(@Param("email")String email);

	
	@Query("select e from Bill e where e.mobileNumber=?1")
	public List<Bill> getAllBillByMobileNumber(@Param("mobileNumber")String mobileNumber);





}
