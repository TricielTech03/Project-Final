package org.finalled.com.conrtoller;

import java.util.List;
import java.util.Optional;

import org.finalled.com.entity.User;
import org.finalled.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	//Rest api method to get all users details
	@RequestMapping("/getUsers")
	public List<User> getUsers() 
	      {
			return userService.getUsers();
	      }
	
	//Rest api method to get particular user based on id
	@RequestMapping("/getUser/{id}")
	public Optional<User> getUser(@PathVariable Long id) 
	      {
		    return userService.getUser(id);
	      }
	
	//Rest api method to create a new user
	@RequestMapping(value="/createUser", method=RequestMethod.POST)
	public void createUser(@RequestBody User user) 
	      {
		       userService.addUser(user);		
	      }
	
	//Rest api method to get an update of existing user 
	@RequestMapping(value ="/updateUser", method=RequestMethod.POST)
	public void updateUser(@RequestBody User user) 
	      {
		       userService.updateUser(user);
	      }
	
	//Rest api method to delete  a user 
	@RequestMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable Long id) 
	    {
		userService.deleteUser(id);
    	}


}
