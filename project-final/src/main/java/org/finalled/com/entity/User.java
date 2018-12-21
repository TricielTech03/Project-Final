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
 private Long id;
 @NonNull
 @Column(name = "email")
 private String email;
 
 @Column(name = "firstname")
 private String firstname; 
 
 @Column(name = "lastname")
 private String lastname;
 @NonNull
 @Column(name = "password")
 private String password;

 @Column(name = "active")
 private int active;
 
 @NonNull
    @Column(name = "username")
	private String userName;
    
    @Column(name = "phonemobile")
	private String phoneMobile;
    
    @Column(name = "phonell")
	private String phoneLL;
	
    @Column(name = "address")
	private String address;
	
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date updatedDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createdDate;
	
	  @Column(name = "updatedby")
	  private Long updatedBy;
	  @Column(name = "createdby")
	  private Long createdBy;
   
 
 
 
 
 @ManyToMany(cascade=CascadeType.ALL)
 @JoinTable(name="user_role", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
 private Set<Role> roles;

 
 
 
 
 
 
 

 public User() {
	
}

 
 
 
 
 
 







public User(String email) {
	super();
	this.email = email;
	
}














public User(Long id, String email, String firstname, String lastname, String password, int active, String userName,
		String phoneMobile, String phoneLL, String address, Date updatedDate, Date createdDate, Long updatedBy,
		Long createdBy, Set<Role> roles) {
	super();
	this.id = id;
	this.email = email;
	this.firstname = firstname;
	this.lastname = lastname;
	this.password = password;
	this.active = active;
	this.userName = userName;
	this.phoneMobile = phoneMobile;
	this.phoneLL = phoneLL;
	this.address = address;
	this.updatedDate = updatedDate;
	this.createdDate = createdDate;
	this.updatedBy = updatedBy;
	this.createdBy = createdBy;
	this.roles = roles;
}







public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getFirstname() {
  return firstname;
 }

 public void setFirstname(String firstname) {
  this.firstname = firstname;
 }

 public String getLastname() {
  return lastname;
 }

 public void setLastname(String lastname) {
  this.lastname = lastname;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public int getActive() {
  return active;
 }

 public void setActive(int active) {
  this.active = active;
 }

 public Set<Role> getRoles() {
  return roles;
 }

 public void setRoles(Set<Role> roles) {
  this.roles = roles;
 }

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPhoneMobile() {
	return phoneMobile;
}

public void setPhoneMobile(String phoneMobile) {
	this.phoneMobile = phoneMobile;
}

public String getPhoneLL() {
	return phoneLL;
}

public void setPhoneLL(String phoneLL) {
	this.phoneLL = phoneLL;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
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

public Long getUpdatedBy() {
	return updatedBy;
}

public void setUpdatedBy(Long updatedBy) {
	this.updatedBy = updatedBy;
}

public Long getCreatedBy() {
	return createdBy;
}

public void setCreatedBy(Long createdBy) {
	this.createdBy = createdBy;
}
 
}