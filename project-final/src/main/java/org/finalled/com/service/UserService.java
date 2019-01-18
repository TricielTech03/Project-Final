package org.finalled.com.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.finalled.com.entity.User;
import org.finalled.com.repository.userDetailsDTO;
import org.springframework.stereotype.Service;

@Service
@Transactional
public interface UserService {
  
 public User findUserByEmail(String email);
 
public List<userDetailsDTO> findUserByUserName(String email, String password, Long id, String usertype);
 
 
 
 
 public void saveUser(User user);
 
	public List<User> getUsers();
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public boolean deleteUser(Long id);
	
	public Optional<User> getUser(Long id);

	
}