package com.capgemini.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.modules.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer , Long> {
   @Query(value="select e from Customer e where e.userName=?1")
//	@Query(value="select * from customer e where e.aadhar_number=:aadharNumber",nativeQuery=true)
	public Customer searchUserByUserName(@Param("userName")String name);
   @Query(value="select e from Customer e where e.mobileNumber=?1")
   public Customer searchCustomerByMobile(@Param("mobileNumber")String name1);
   @Query(value="select e from Customer e where e.email=?1")
   public Customer searchCustomerByEmail(@Param("email")String name2);
   @Query(value="select e from Customer e where e.userId=?1")
   public Customer searchUserByUserId(@Param("userId")Long name3);
   @Query(value="select e from Customer e where e.aadharNumber=?1")
   public Customer SearchCustomerByAadhar(@Param("aadharNumber")Long number);
//////////////////////////////////////////////////////////////////////////////////////////////
   @Query(value="select e from Customer e where e.firstName=?1")
   public List<Customer> SearchCustomerByName(@Param("firstName")String Name);


   
}
