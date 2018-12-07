package org.finalled.com.conrtoller;

import java.util.List;
import java.util.Optional;

import org.finalled.com.entity.User;
import org.finalled.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	public Optional<User> getUser(Long id) {
		return userService.getUser(id);
	}
	
	public void createUser(User user) {
		userService.addUser(user);		
	}
	
	public void updateUser(User user, Long id) {
		userService.updateUser(user, id);
	}
	
	public void deleteUser(Long id) {
		userService.deleteUser(id);
	}
}
