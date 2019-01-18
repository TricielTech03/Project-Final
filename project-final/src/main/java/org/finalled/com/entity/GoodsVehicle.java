package org.finalled.com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="goods_vehicle")
public class GoodsVehicle 
{
	           
				
	@Id
	 @GeneratedValue() 
	private Long id;
	
	@Column(name="user_id")
	private String userId;
				
				@Column(name="vehicle_id")
				private String vehicleId;
				
				@Column(name="post_id")
				private String postId;
				
				
				
				@Column(name="status")
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
				
				public GoodsVehicle(@JsonProperty("user_id") String userId,  @JsonProperty("vehicle_id")String vehicleId,@JsonProperty("post_id") String postId, @JsonProperty("status")String status) {
				
					this.userId = userId;
					this.vehicleId = vehicleId;
					this.postId = postId;
					this.status = status;
				}




				public Date getCreatedAt() {
					return createdAt;
				}

				public void setCreatedAt(Date createdAt) {
					this.createdAt = createdAt;
				}

				public String getUserId() {
					return userId;
				}





				public void setUserId(String userId) {
					this.userId = userId;
				}





				public String getVehicleId() {
					return vehicleId;
				}





				public void setVehicleId(String vehicleId) {
					this.vehicleId = vehicleId;
				}





				public String getPostId() {
					return postId;
				}





				public void setPostId(String postId) {
					this.postId = postId;
				}





				public String getStatus() {
					return status;
				}





				public void setStatus(String status) {
					this.status = status;
				}
				
				
				
				
				
				
				
				
}
