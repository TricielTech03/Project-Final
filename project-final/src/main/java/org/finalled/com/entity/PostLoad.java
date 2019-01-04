package org.finalled.com.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;



@Entity(name="post_loads")
public class PostLoad 
{
	@Id
	private Long id;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="truck_type")
	private String truckType;
	
	@Column(name="capacity")
	private String capacity;
	
	@Column(name="goods_type")
	private String goodsType;
	
	@Column(name="goods_photo")
	private String goodsPhoto;
	
	@Column(name="from_address")
	private String fromAddress;
	
	@Column(name="to_address")
	private String toAddress;
	
	@Column(name="freight_charges")
	private String freightCharges;
	
	@Column(name="location_charges")
	private String locationCharges;
	
	@Column(name="display_charges")
	private String displayCharges;
	
	@Column(name="cdate")
	private Date cDate;
	
	@Column(name="ctime")
	private Time cTime;

	public PostLoad() 
	{
		
	}

	
	
	public PostLoad(Long id, String userId, String truckType, String capacity) {
		super();
		this.id = id;
		this.userId = userId;
		this.truckType = truckType;
		this.capacity = capacity;
	}



	public PostLoad(@JsonProperty("id") Long id,                      @JsonProperty("user_id")  String userId,       @JsonProperty("truck_type") String truckType,           @JsonProperty("capacity") String capacity,                @JsonProperty("goods_type")  String goodsType,         @JsonProperty("goods_photo")  String goodsPhoto,
			        @JsonProperty("from_address") String fromAddress, @JsonProperty("to_address")  String toAddress, @JsonProperty("freight_charges") String freightCharges, @JsonProperty("location_charges") String locationCharges, @JsonProperty("display_charges")  String displayCharges,
			        @JsonProperty("cdate") Date cDate,                @JsonProperty("ctime") Time cTime) {
		
		this.id = id;
		this.userId = userId;
		this.truckType = truckType;
		this.capacity = capacity;
		this.goodsType = goodsType;
		this.goodsPhoto = goodsPhoto;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.freightCharges = freightCharges;
		this.locationCharges = locationCharges;
		this.displayCharges = displayCharges;
		this.cDate = cDate;
		this.cTime = cTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
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

	public String getFreightCharges() {
		return freightCharges;
	}

	public void setFreightCharges(String freightCharges) {
		this.freightCharges = freightCharges;
	}

	public String getLocationCharges() {
		return locationCharges;
	}

	public void setLocationCharges(String locationCharges) {
		this.locationCharges = locationCharges;
	}

	public String getDisplayCharges() {
		return displayCharges;
	}

	public void setDisplayCharges(String displayCharges) {
		this.displayCharges = displayCharges;
	}

	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}

	public Time getcTime() {
		return cTime;
	}

	public void setcTime(Time cTime) {
		this.cTime = cTime;
	}
	
	
	
	
	
	
	
}
