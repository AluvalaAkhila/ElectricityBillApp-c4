package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.modules.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address , Long> {
	@Query(value="select e from Address e where e.taluka=?1")
	   public List<Address> getAllAddressByName(@Param("taluka")String Name);
	@Query(value="select e from Address e where e.village=?1")
	   public List<Address> getAllAddressByVillage(@Param("village")String village);
	@Query(value="select e from Address e where e.district=?1")
	   public List<Address> getAllAddressByDistrict(@Param("district")String district);


}
