package org.finalled.com.conrtoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.finalled.com.entity.PostLoad;
import org.finalled.com.entity.Truck;
import org.finalled.com.service.PostLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PostLoadController 
{

	@Autowired
	private PostLoadService postLoadService;
	
	
	@RequestMapping("/post_load_list.php")
	  public Map<String, List<PostLoad>> getPostLoads() throws JsonProcessingException 
			{
			 Map<String, List<PostLoad>> usersMap = new HashMap<String, List<PostLoad>>();
			  List<PostLoad> post = postLoadService.getPostLoads();
			  usersMap.put("result", post);
			  ObjectMapper mapper = new ObjectMapper();
			  System.out.println(mapper.writeValueAsString(usersMap));

			  return usersMap;
			
			}
	     //Rest api method to create a new PostLoad
			@RequestMapping(value="/post_loads.php", method=RequestMethod.POST)
			public void createPostLoad(@RequestBody PostLoad postload) 
			      {
				       postLoadService.createPostLoad(postload);	
				  }
			
			//Rest api method to get an update of existing PostLoad
			@RequestMapping(value ="/post_loads_update.php", method=RequestMethod.POST)
			public void updatePostLoad(@RequestBody PostLoad postload) 
			      {
				       postLoadService.updatePostLoad(postload);
			      }
	
			@RequestMapping("/deletepost_loads.php/{id}")
			public void deletePostLoad(@PathVariable Long id) 
			    {
				postLoadService.deletePostLoad(id);
		    	}
	
}
