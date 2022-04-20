package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.capgemini.modules.Connection;

@Repository

public interface ConnectionRepository extends JpaRepository<Connection , Long>{

}
