package org.finalled.com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class User {
         
	@Id 
	@GeneratedValue()
	private Long id;
	 
	private String firstName;
	private String lasrName;
	private String userName;
	private String email;
	private String password;
	private String phoneMobile;
	private String phoneLL;
	
	private String address;
	
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date updatedDate;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createdDate;
	private Long updatedBy;
	private Long createdBy;
	
	
	public User() {
		//super();
	}
	public User(Long id, String firstName, String lasrName, String userName, String email, String password,
			String phoneMobile, String phoneLL, String address, Date updatedDate, Date createdDate, Long updatedBy,
			Long createdBy) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lasrName = lasrName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.phoneMobile = phoneMobile;
		this.phoneLL = phoneLL;
		this.address = address;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.createdBy = createdBy;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasrName() {
		return lasrName;
	}
	public void setLasrName(String lasrName) {
		this.lasrName = lasrName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lasrName=" + lasrName + ", userName=" + userName
				+ ", email=" + email + ", password=" + password + ", phoneMobile=" + phoneMobile + ", phoneLL="
				+ phoneLL + ", address=" + address + ", updatedDate=" + updatedDate + ", createdDate=" + createdDate
				+ ", updatedBy=" + updatedBy + ", createdBy=" + createdBy + "]";
	}
	
	

}
