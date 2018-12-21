package org.finalled.com.conrtoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.finalled.com.entity.Truck;
import org.finalled.com.entity.User;
import org.finalled.com.repository.userDetailsDTO;
import org.finalled.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



/*@Controller*/
@RestController
public class UserController {

 @Autowired
 private UserService userService;
 
 @RequestMapping(value= {"/", "/login_user.php"}, method=RequestMethod.GET)
 public ModelAndView login(/*@RequestParam String email*/) {
  ModelAndView model = new ModelAndView();
  /*User user=new User();
  model.addObject("userEmail" +user.getEmail());*/
  model.setViewName("user/login_user.php");
  return model;
 }
 /*@RequestMapping(value = "/mno/{objectKey}", method = RequestMethod.GET, produces = "application/json")
 public List<String> getBook(HttpServletRequest httpServletRequest, @PathVariable(name = "objectKey") String objectKey
   , @RequestParam(value = "id", defaultValue = "false")String id,@RequestParam(value = "name", defaultValue = "false") String name) throws Exception {
            //logic
*/ @RequestMapping(value= {"/signup"}, method=RequestMethod.GET)
 public ModelAndView signup() {
  ModelAndView model = new ModelAndView();
  User user = new User();
  model.addObject("user", user);
  
  model.setViewName("user/signup");
  
  return model;
 }
 
 @RequestMapping(value= {"/signup"}, method=RequestMethod.POST)
 public ModelAndView createUser(@Valid User user, BindingResult bindingResult) {
  ModelAndView model = new ModelAndView();
  User userExists = userService.findUserByEmail(user.getEmail());
  
  if(userExists != null) {
   bindingResult.rejectValue("email", "error.user", "This email already exists!");
  }
  if(bindingResult.hasErrors()) {
   model.setViewName("user/signup");
  } else {
   userService.saveUser(user);
   model.addObject("msg", "User has been registered successfully!");
   model.addObject("user", new User());
   model.setViewName("user/signup");
  }
  
  return model;
 }
 
 @RequestMapping(value= {"/home/home"}, method=RequestMethod.GET)
 public ModelAndView home() {
  ModelAndView model = new ModelAndView();
  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
  User user = userService.findUserByEmail(auth.getName());
  
  model.addObject("userName",       user.getFirstname()+    " " +
		          "userLastName : "+user.getLastname()+  " "  +  
		          "userEmail    : "+user.getEmail());
  
  model.setViewName("home/home");
  return model;
 }
 
 @RequestMapping(value= {"/access_denied"}, method=RequestMethod.GET)
 public ModelAndView accessDenied() {
  ModelAndView model = new ModelAndView();
  model.setViewName("errors/access_denied");
  return model;
 }
 
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
	
	
	//Rest api method to create a new user and getting json response
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
	
	
	 @RequestMapping(value= {"/userDetails"}, method=RequestMethod.GET)
	 public List<userDetailsDTO> findUserByUserName(@Param("email") String email,@Param("password") String password)
	 {
		 
		 
			return userService.findUserByUserName(email,password);
	      }
	/* public Map<String, List<User>> findUserByUserName(@Param("email") String email) throws JsonProcessingException 
		{
		 Map<String, List<User>> usersMap = new HashMap<String, List<User>>();
		  List<User> Users = userService.findUserByUserName(email);
		  usersMap.put("result", Users);
		  ObjectMapper mapper = new ObjectMapper();
		  System.out.println(mapper.writeValueAsString(usersMap));

		  return usersMap;
		
		}*/
	
}