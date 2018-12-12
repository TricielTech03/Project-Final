
package org.finalled.com.conrtoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.finalled.com.entity.Truck;
import org.finalled.com.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class TruckController 
{
		
	     @Autowired
	     private TruckService truckService;
	    		
		//Rest api method to get all trucks details
		/*@RequestMapping("/getTrucks")
		public List<Truck> getTrucks() 
		      {
				return truckService.getTrucks();
		      }*/
	     @RequestMapping("/getTrucks")
		public Map<String, List<Truck>> getTrucks() throws JsonProcessingException 
		{
		 Map<String, List<Truck>> usersMap = new HashMap<String, List<Truck>>();
		  List<Truck> trucks = truckService.getTrucks();
		  usersMap.put("result", trucks);
		  ObjectMapper mapper = new ObjectMapper();
		  System.out.println(mapper.writeValueAsString(usersMap));

		  return usersMap;
		
		}
		
		
		
		
		//Rest api method to get particular truck based on id
		@RequestMapping("/getTruck/{id}")
		public Optional<Truck> getTruck(@PathVariable Long id) 
		      {
			    return truckService.getTruck(id);
		      }
		
		//Rest api method to create a new truck
		@RequestMapping(value="/createTruck", method=RequestMethod.POST)
		public void createTruck(@RequestBody Truck truck) 
		      {
			       truckService.createTruck(truck);	
			       
			  
		      }
		
		//Rest api method to get an update of existing truck
		@RequestMapping(value ="/updateTruck", method=RequestMethod.POST)
		public void updateTruck(@RequestBody Truck truck) 
		      {
			       truckService.updateTruck(truck);
		      }
		
		//Rest api method to delete  a truck based on id 
		@RequestMapping("/deleteTruck/{id}")
		public void deleteTruck(@PathVariable Long id) 
		    {
			truckService.deleteTruck(id);
	    	}


}
