package org.finalled.com.conrtoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
//JSON view

import com.fasterxml.jackson.databind.ObjectMapper;

import com.monitorjbl.json.JsonViewModule;


import org.finalled.com.entity.PostLoad;
import org.finalled.com.service.PostLoadService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class PostLoadController 
{

	@Autowired
	private PostLoadService postLoadService;
	ObjectMapper mapper = new ObjectMapper().registerModule(new JsonViewModule());
	
	@RequestMapping(value= {"/post_load_list.php/user/{id}"},method=RequestMethod.GET)
	 public Map<String, Optional<PostLoad>> getPostLoad(@PathVariable Long id) throws JsonProcessingException 
	  {
			 Map<String, Optional<PostLoad>> usersMap = new HashMap<String, Optional<PostLoad>>();
			  Optional<PostLoad> post = postLoadService.getPostLoad(id);
			  usersMap.put("result", post);
			  ObjectMapper mapper = new ObjectMapper();
			  System.out.println(mapper.writeValueAsString(usersMap));

			  return usersMap;
			
			}
	
	//post list based on user id
	
	@RequestMapping(value= {"/post_load_list.php/{userId}"}, method = RequestMethod.POST)
	public Map<String, List<PostLoad>>  getPostLoadByUserId(@RequestParam  String userId) {
		
	  
		 Map<String, List<PostLoad>> usersMap = new HashMap<String, List<PostLoad>>();
			  List<PostLoad> post = postLoadService.getPostLoadByUserId(userId);
			  
			  //System.out.println(post+"==========================");
			  usersMap.put("result", post);
			  ObjectMapper mapper = new ObjectMapper();
			  //System.out.println(mapper.writeValueAsString(usersMap));

			  return usersMap;
		// return postLoadService.getPostLoadByUserId(userId);
			}
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
	
	
	
	
	/*PostLoad postLoad = new PostLoad();

    SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id");

    FilterProvider filters = new SimpleFilterProvider().addFilter("id", filter);

    MappingJacksonValue mapping = new MappingJacksonValue(postLoad);

    mapping.setFilters(filters);

    return mapping;
  }
*/
//JSON VIEW METHOD TO LIMIT ATTIBUTES
/*@ResponseBody
  //public Map<String, List<PostLoad>> getPostLoadByUserId(@PathVariable  String userId) throws JsonProcessingException 
	public String getPostLoadByUserId(@PathVariable  String userId) throws JsonProcessingException{
	

//get a list of the objects
  List<PostLoad> getPostLoads = postLoadService.getPostLoadByUserId(userId);

  //exclude expensive field
  String json = mapper.writeValueAsString(JsonView.with(getPostLoads).onClass(PostLoad.class, match().exclude("capacity","userId","id","truckType","goodsType","goodsPhoto","fromAddress","toAddress")));
  
  return json;
  
}*/
  
	
	
	     //Rest api method to create a new PostLoad
	  @RequestMapping(value="/post_loads.php", method=RequestMethod.POST) public
	  void createPostLoad(@RequestBody PostLoad postload) {
	  postLoadService.createPostLoad(postload); }
	 
			
	  
	  
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
