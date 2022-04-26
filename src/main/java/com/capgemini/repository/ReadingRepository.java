package com.capgemini.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.modules.Reading;
@Repository

public interface ReadingRepository extends JpaRepository<Reading , Long> {
//	@Query("select reading from Reading reading,Bill bill where reading.consumerNumber=:consumerNumber and bill.billDate=:billDate")
//	public Reading findMeterReadingByConsumerNumberAndBillDate(@Param("consumerNumber") Long consumerNumber, @Param("billDate") LocalDate billDate);

	

	
	

}
