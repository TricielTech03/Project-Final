package org.finalled.com.repository;

import org.finalled.com.entity.GoodsVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GoodsRepository extends CrudRepository<GoodsVehicle, Long>
{

	/* GoodsVehicle findGoodByPostId(String post_id); */
	
	
}