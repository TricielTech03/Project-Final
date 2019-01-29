package org.finalled.com.service;

import java.util.ArrayList;
import java.util.List;

import org.finalled.com.entity.MyBooking;
import org.finalled.com.entity.Test;
import org.finalled.com.repository.MyBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBookingService 
{

	@Autowired
	private MyBookingRepository myBookingRepository;
	
	
	
	  List<MyBooking> findByUserId(String user_id) { return
	  myBookingRepository.findByUserId(user_id); }
	 
	
	public List<MyBooking> getBookings()
	{
		List<MyBooking> mybook =new ArrayList<>();
		myBookingRepository.findAll().forEach(mybook::add);
		return mybook;
		
	}
	
	public void createBooking(MyBooking mybooking)
	{
		myBookingRepository.save(mybooking);
	}
	
	public MyBooking updateBooking(MyBooking mybooking)
	{
		return myBookingRepository.save(mybooking);
		
	}
	
	public boolean deleteBooking(Long id)
	{
		if(myBookingRepository.findById(id)!=null)
		{
			myBookingRepository.deleteById(id);
		    return true;
		}
		else 
		{
			return false;
		}
	}
	
}
