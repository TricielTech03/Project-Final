package org.finalled.com.repository;

import org.finalled.com.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TruckRepository extends JpaRepository<Truck, Long>
{

}
