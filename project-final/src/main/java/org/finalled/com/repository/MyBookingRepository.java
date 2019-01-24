package org.finalled.com.repository;

import java.util.List;

import org.finalled.com.entity.MyBooking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookingRepository extends  JpaRepository<MyBooking, Long>
{
	/* List<MyBooking> findByUserId(String user_id); */
}
