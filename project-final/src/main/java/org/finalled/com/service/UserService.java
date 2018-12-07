package org.finalled.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.finalled.com.entity.User;
import org.finalled.com.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserRepository userRepository;
	
	public List<User> getUsers(){
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add); 
		return users;
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void updateUser(User user, Long id) {
		userRepository.save(user);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}
}
