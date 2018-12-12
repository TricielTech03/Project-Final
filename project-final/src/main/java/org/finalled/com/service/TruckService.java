package org.finalled.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.finalled.com.entity.Truck;
import org.finalled.com.repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TruckService
{

	@Autowired
	 private TruckRepository truckRepository;
	 
	public List<Truck> getTrucks() 
	{
		System.out.println("Truck Service");
		List<Truck> trucks = new ArrayList<>();
		truckRepository.findAll().forEach(trucks::add);
		return trucks;
	}
	
	
	
	public Optional<Truck> getTruck(Long id) 
	{
		return truckRepository.findById(id);
	}
	
	
	public void createTruck(Truck truck) 
	{
		truckRepository.save(truck);
	}
	
	public Truck updateTruck(Truck truck) 
	{
		return truckRepository.save(truck);
	}
	
	public boolean deleteTruck(Long id) {
		if(truckRepository.findById(id)!=null) 
		     {
			 truckRepository.deleteById(id);
			 return true;
			 }
		else {
				return false;
			 }
	}
	
	
	
}





