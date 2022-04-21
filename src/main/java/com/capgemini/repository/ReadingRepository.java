package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.modules.Reading;
@Repository

public interface ReadingRepository extends JpaRepository<Reading , Long> {

}
