package org.finalled.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.finalled.com.entity.User;
import org.finalled.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers(){
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add); 
		return users;
	}
	
	public void addUser(User user) {
		  userRepository.save(user);
	}
	
	public void updateUser(User user) {
		 userRepository.save(user);
	}
	
	public boolean deleteUser(Long id) {
		if(userRepository.findById(id)!=null) {
		 userRepository.deleteById(id);
		 return true;
		}else {
			return false;
		}
		
	}
	
	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}
}

