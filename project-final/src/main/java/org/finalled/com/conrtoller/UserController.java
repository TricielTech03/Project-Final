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
	
	/*@Autowired
	private UserRepository userRepository;*/
	
	@RequestMapping("/getUsers")
	public List<User> getUsers() {
			return userService.getUsers();
		/*List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;*/
			
	}
	@RequestMapping("/getUser/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userService.getUser(id);
	}
	@RequestMapping(value="/createUser", method=RequestMethod.POST)
	public void createUser(@RequestBody User user) {
		userService.addUser(user);		
	}
	@RequestMapping(value ="/updateUser", method=RequestMethod.POST)
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	@RequestMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
}
