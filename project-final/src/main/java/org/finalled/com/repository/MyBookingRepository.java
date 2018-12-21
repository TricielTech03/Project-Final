package org.finalled.com.repository;

import org.finalled.com.entity.MyBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookingRepository extends  JpaRepository<MyBooking, Long>
{

}
