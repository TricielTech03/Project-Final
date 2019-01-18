package org.finalled.com.repository;

import java.util.List;

import org.finalled.com.entity.Test;
import org.finalled.com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.multipart.MultipartFile;



public interface TestRepository extends JpaRepository<Test, Long>
{

	 List<Test> findByTruckType(String truckType);
	 

	
	
}



