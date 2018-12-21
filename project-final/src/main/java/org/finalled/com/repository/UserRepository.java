package org.finalled.com.repository;



import java.util.List;

import org.finalled.com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository("userRepository")

public interface UserRepository extends JpaRepository<User, Long> {
 
 User findByEmail(String email);
 
 
 @Query(value="select new org.finalled.com.repository.userDetailsDTO ( tc.email, tc.userName,tc.password) from User tc where email=?1 ")
 List<userDetailsDTO> findUserByUserName(  @Param("email ") String email,@Param("password") String password);


 
}