package org.finalled.com.conrtoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.finalled.com.entity.GoodsVehicle;
import org.finalled.com.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class GoodController 
{

	@Autowired
	private GoodService goodService;
	
	
	        //Rest api method to get all goods details
			@RequestMapping("/goods_vehicle_list.php")
			public Map<String, List<GoodsVehicle>>  getGoods() throws JsonProcessingException 
			{
			 Map<String, List<GoodsVehicle>> usersMap = new HashMap<String, List<GoodsVehicle>>();
			  List<GoodsVehicle> goods = goodService.getGoods();
			  usersMap.put("result", goods);
			  ObjectMapper mapper = new ObjectMapper();
			  System.out.println(mapper.writeValueAsString(usersMap));

			  return usersMap;
			
			}
			
			
			//Rest api method to create a new good
			@RequestMapping(value="/goods_vehicle.php", method=RequestMethod.POST)
			public void createGood(@RequestBody GoodsVehicle good) 
			      {
				     goodService.createGood(good);	
				     System.out.println("Succesfully Booked");
				  
			      }
			
		
			
			//Rest api method to get an update of existing good
			@RequestMapping(value ="/goods_vehicle"
					+ "_update.php", method=RequestMethod.POST)
			public void updateGood(@RequestBody GoodsVehicle good) 
			      {
				 goodService.updateGood(good);
			      }
			
			//Rest api method to delete  a good based on id 
			@RequestMapping("/deletegoods_vehicle.php/{id}")
			public void deleteGood(@PathVariable Long id) 
			    {
				 goodService.deleteGood(id);
		    	}
			
	
}
