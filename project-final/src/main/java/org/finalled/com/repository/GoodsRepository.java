package org.finalled.com.repository;

import org.finalled.com.entity.GoodsVehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<GoodsVehicle, Long>
{

}
