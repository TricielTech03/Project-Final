package org.finalled.com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name="goods_vehicle")
public class GoodsVehicle 
{
	           @Id
				private Long id;
				private String vehicleId;
				private String postId;
				private String userId;
				private String status;
				private String updatedBy;
				private String updatedOn;
				
				@Temporal(TemporalType.TIMESTAMP)
				@UpdateTimestamp
				private Date updatedAt;
				
				@Temporal(TemporalType.TIMESTAMP)
				@CreationTimestamp
				private Date createdAt;

				public GoodsVehicle() 
				{
					
				}

				public GoodsVehicle(Long id, String vehicleId, String postId, String userId, String status,
						String updatedBy, String updatedOn, Date updatedAt, Date createdAt) {
					super();
					this.id = id;
					this.vehicleId = vehicleId;
					this.postId = postId;
					this.userId = userId;
					this.status = status;
					this.updatedBy = updatedBy;
					this.updatedOn = updatedOn;
					this.updatedAt = updatedAt;
					this.createdAt = createdAt;
				}

				public Long getId() {
					return id;
				}

				public void setId(Long id) {
					this.id = id;
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

				public String getUserId() {
					return userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getStatus() {
					return status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getUpdatedBy() {
					return updatedBy;
				}

				public void setUpdatedBy(String updatedBy) {
					this.updatedBy = updatedBy;
				}

				public String getUpdatedOn() {
					return updatedOn;
				}

				public void setUpdatedOn(String updatedOn) {
					this.updatedOn = updatedOn;
				}

				public Date getUpdatedAt() {
					return updatedAt;
				}

				public void setUpdatedAt(Date updatedAt) {
					this.updatedAt = updatedAt;
				}

				public Date getCreatedAt() {
					return createdAt;
				}

				public void setCreatedAt(Date createdAt) {
					this.createdAt = createdAt;
				}

				@Override
				public String toString() {
					return "GoodsVehicle [id=" + id + ", vehicleId=" + vehicleId + ", postId=" + postId + ", userId="
							+ userId + ", status=" + status + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn
							+ ", updatedAt=" + updatedAt + ", createdAt=" + createdAt + "]";
				}
				
				
				
				
				
	
	
}
