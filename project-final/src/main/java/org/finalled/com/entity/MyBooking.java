package org.finalled.com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "mybooking")
@SecondaryTables({
		@SecondaryTable(name = "post_loads", pkJoinColumns = {
				@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "booking_id") }),
		

		@SecondaryTable(name = "goods_vehicle", pkJoinColumns = {
				@PrimaryKeyJoinColumn(name = "booking_id", referencedColumnName = "booking_id") }),
		
		@SecondaryTable(name = "vehicle_list", pkJoinColumns = {
				@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "booking_id") }) })




public class MyBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
	private Long booking_id;
	 
	 @JsonProperty("user_id")
	@Column(name = "user_id",    table="goods_vehicle")
	private String userId;
	
	 @JsonProperty("truck_name")
	@Column(name = "truck_name", table = "vehicle_list")
	private String truckName;

	 
	 @JsonProperty("truck_type")
	@Column(name = "truck_type", table = "vehicle_list")
	private String truckType;

	 
	 @JsonProperty("truck_main_image")
	@Column(name = "truck_main_image", table = "vehicle_list")
	private String truckMainImg;

	 @JsonProperty("truck_owner")
	@Column(name = "truck_owner", table = "vehicle_list")
	private String truckOwner;

	 
	 @JsonProperty("truck_owner_phone")
	@Column(name = "truck_owner_phone", table = "vehicle_list")
	private String truckOwnerPhone;

	 
	 @JsonProperty("driver_name")
	@Column(name = "driver_name", table = "vehicle_list")
	private String diverName;

	 @JsonProperty("driver_mobile_no")
	@Column(name = "driver_mobile_no", table = "vehicle_list")
	private String driverMobileNumber;

	 
	 @JsonProperty("goods_image")
	@Column(name = "goods_photo", table = "post_loads")
	private String goodsPhoto;

	 
	 @JsonProperty("goods_type")
	 @Column(name = "goods_type", table = "post_loads")
		private String goodsType;
	 
	 @JsonProperty("from_address")
	@Column(name = "from_address", table = "post_loads")
	private String fromAddress;

	 
	 @JsonProperty("to_address")
	@Column(name = "to_address", table = "post_loads")
	private String toAddress;

	 
	 @JsonProperty("capacity")
	@Column(name = "capacity", table = "post_loads")
	private String capacity;

	 
	 @JsonProperty("freight_charges")
	@Column(name = "freight_charges", table = "post_loads")
	private String freightCharges;

	 
	 @JsonProperty("cdate")
	 @Column(name="cdate", table = "post_loads")
		private Date cDate;
	
	
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getTruckMainImg() {
		return truckMainImg;
	}

	public void setTruckMainImg(String truckMainImg) {
		this.truckMainImg = truckMainImg;
	}

	public String getTruckOwner() {
		return truckOwner;
	}

	public void setTruckOwner(String truckOwner) {
		this.truckOwner = truckOwner;
	}

	public String getTruckOwnerPhone() {
		return truckOwnerPhone;
	}

	public void setTruckOwnerPhone(String truckOwnerPhone) {
		this.truckOwnerPhone = truckOwnerPhone;
	}

	public String getDiverName() {
		return diverName;
	}

	public void setDiverName(String diverName) {
		this.diverName = diverName;
	}

	public String getDriverMobileNumber() {
		return driverMobileNumber;
	}

	public void setDriverMobileNumber(String driverMobileNumber) {
		this.driverMobileNumber = driverMobileNumber;
	}

	public String getGoodsPhoto() {
		return goodsPhoto;
	}

	public void setGoodsPhoto(String goodsPhoto) {
		this.goodsPhoto = goodsPhoto;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getFreightCharges() {
		return freightCharges;
	}

	public void setFreightCharges(String freightCharges) {
		this.freightCharges = freightCharges;
	}

	/*
	 * public MyBooking() {
	 * 
	 * }
	 */

}
