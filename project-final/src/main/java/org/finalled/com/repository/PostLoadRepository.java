package org.finalled.com.repository;

import java.util.List;

import org.finalled.com.entity.CustomPostLoad;
import org.finalled.com.entity.PostLoad;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PostLoadRepository extends JpaRepository<PostLoad, Long>
{

	

	public List<PostLoad> findByUserId(String userId);
	
   
	
	
}
