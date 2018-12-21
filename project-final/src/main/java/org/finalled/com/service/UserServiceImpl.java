package org.finalled.com.service;

import org.finalled.com.entity.Role;
import org.finalled.com.entity.User;
import org.finalled.com.repository.RoleRespository;
import org.finalled.com.repository.UserRepository;
import org.finalled.com.repository.userDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
 
 @Autowired
 private UserRepository userRepository;
 
 @Autowired
 private RoleRespository roleRespository;
 
 @Autowired
 private BCryptPasswordEncoder bCryptPasswordEncoder;

 @Override
 public User findUserByEmail(String email) {
  return userRepository.findByEmail(email);
 }

 @Override
 public void saveUser(User user) {
  user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
  user.setActive(1);
  Role userRole = roleRespository.findByRole("ADMIN");
  user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
  userRepository.save(user);
 }

@Override
public List<User> getUsers() {
	List<User> users = new ArrayList<>();
	userRepository.findAll().forEach(users::add); 
	return users;
}

@Override
public void addUser(User user) {
	userRepository.save(user);
	
}

@Override
public void updateUser(User user) {
	 userRepository.save(user);
	
}

@Override
public boolean deleteUser(Long id) {
	if(userRepository.findById(id)!=null) {
		 userRepository.deleteById(id);
		 return true;
		}else {
			return false;
		}
		
}

@Override
public Optional<User> getUser(Long id) {
	return userRepository.findById(id);

}

@Override
public List<userDetailsDTO> findUserByUserName(String email,String password) {
	
	return userRepository.findUserByUserName(email,password);
}



}