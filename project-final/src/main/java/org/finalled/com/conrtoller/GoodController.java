package org.finalled.com.conrtoller;

import java.util.List;


import org.finalled.com.entity.GoodsVehicle;
import org.finalled.com.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController 
{

	@Autowired
	private GoodService goodService;
	
	
	//Rest api method to get all goods details
			@RequestMapping("/getGoods")
			public List<GoodsVehicle> getGoods() 
			      {
					return  goodService.getGoods();
			      }
			
			
			
			//Rest api method to create a new good
			@RequestMapping(value="/createGood", method=RequestMethod.POST)
			public void createGood(@RequestBody GoodsVehicle good) 
			      {
				 goodService.createGood(good);		
				  
			      }
			
			//Rest api method to get an update of existing good
			@RequestMapping(value ="/updateGood", method=RequestMethod.POST)
			public void updateGood(@RequestBody GoodsVehicle good) 
			      {
				 goodService.updateGood(good);
			      }
			
			//Rest api method to delete  a good based on id 
			@RequestMapping("/deleteGood/{id}")
			public void deleteGood(@PathVariable Long id) 
			    {
				 goodService.deleteGood(id);
		    	}
	
	
}
