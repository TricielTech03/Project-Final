package org.finalled.com.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.micrometer.core.lang.NonNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
@Transactional
@Table(name = "user")
public class User {
 
 @Id
	
	  @GeneratedValue(strategy = GenerationType.AUTO)
	 
	/* @Column(name = "userid") */
 private Long id;
 
 
 @NonNull
 @Column(name = "username")
	private String username;
 
 @Column(name = "usertype")
 private String usertype;

 
 @NonNull
 @Column(name = "email")
 private String email;
 
 @NonNull
 @Column(name = "password")
 private String password;
 
	/*
	 * @Column(name = "firstname") private String firstname;
	 */
 
 @Column(name = "phone")
	private String phone;

 @Column(name = "address")
	private String address;
 
 @Column(name = "active")
 private int active;
 

    
   
    
	/*
	 * @Column(name = "phonell") private String phoneLL;
	 */
	
  
	
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date updatedDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createdDate;
	
	  
 

 @ManyToMany(cascade=CascadeType.ALL)
 @JoinTable(name="user_role", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
 private Set<Role> roles;

 public User() {
	
}



public User(String email) {
	super();
	this.email = email;
	
}









public User(Long id, String username, String usertype, String email, String password, String phone, String address,
		int active, Date updatedDate, Date createdDate, Set<Role> roles) {
	super();
	this.id = id;
	this.username = username;
	this.usertype = usertype;
	this.email = email;
	this.password = password;
	this.phone = phone;
	this.address = address;
	this.active = active;
	this.updatedDate = updatedDate;
	this.createdDate = createdDate;
	this.roles = roles;
}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getUsername() {
	return username;
}



public void setUsername(String username) {
	this.username = username;
}



public String getUsertype() {
	return usertype;
}



public void setUsertype(String usertype) {
	this.usertype = usertype;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public String getPhone() {
	return phone;
}



public void setPhone(String phone) {
	this.phone = phone;
}



public String getAddress() {
	return address;
}



public void setAddress(String address) {
	this.address = address;
}



public int getActive() {
	return active;
}



public void setActive(int active) {
	this.active = active;
}



public Date getUpdatedDate() {
	return updatedDate;
}



public void setUpdatedDate(Date updatedDate) {
	this.updatedDate = updatedDate;
}



public Date getCreatedDate() {
	return createdDate;
}



public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}



public Set<Role> getRoles() {
	return roles;
}



public void setRoles(Set<Role> roles) {
	this.roles = roles;
}

}