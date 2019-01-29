package org.finalled.com.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity()
@Table(name = "goods_vehicle")

public class GoodsVehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "booking_id", updatable = false, nullable = false)
	
	private Long booking_id;

	/*
	 * @GeneratedValue()
	 * 
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "booking_id", referencedColumnName = "booking_id") private
	 * MyBooking booking_id;
	 */

	@Column(name = "user_id")
	private String user_id;

	@Column(name = "vehicle_id")
	private String vehicle_id;

	@Column(name = "post_id")
	private String post_id;

	@Column(name = "status")
	private String status;

	/*
	 * @Column(name="user_id") private String updatedBy;
	 * 
	 * @Column(name="user_id") private String updatedOn;
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @UpdateTimestamp private Date updatedAt;
	 */

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createdAt;

	public GoodsVehicle() {

	}

	public Long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(Long booking_id) {
		this.booking_id = booking_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/*
	 * public GoodsVehicle(@JsonProperty("id") Long
	 * id, @JsonProperty("user_id")String user_id, @JsonProperty("vehicle_id")
	 * String vehicle_id, @JsonProperty("post_id") String
	 * post_id, @JsonProperty("status") String status, Date createdAt) { super();
	 * this.id = id; this.user_id = user_id; this.vehicle_id = vehicle_id;
	 * this.post_id = post_id; this.status = status; this.createdAt = createdAt; }
	 */

}
