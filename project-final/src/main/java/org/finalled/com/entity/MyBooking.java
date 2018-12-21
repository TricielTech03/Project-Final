package org.finalled.com.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="mybooking")
public class MyBooking {
	@Id
	private Long id;

	@Column(name = "truck_name")
	private String truckName;

	@Column(name = "truck_type")
	private String truckType;

	@Column(name = "truck_model")
	private String truckModel;

	@Column(name = "truck_registration_no")
	private String truckRegistrationNumber;

	@Column(name = "truck_driver")
	private String truckDriver;

	@Column(name = "truck_owner")
	private String truckOwner;

	@Column(name = "truck_owner_phone")
	private String truckOwnerPhone;

	@Column(name = "truck_color")
	private String truckColor;

	@Column(name = "goods_image")
	private String goodsImage;

	@Column(name = "capacity")
	private String capacity;

	@Column(name = "goods_type")
	private String goodsType;

	@Column(name = "from_address")
	private String fromAddress;

	@Column(name = "to_address")
	private String toAddress;

	@Column(name = "freight_charges")
	private String freightCharges;

	@Column(name = "truck_image")
	private String truckImage;

	@Column(name = "cdate")
	private Date cDate;

	public MyBooking() 
	{

	}

	public MyBooking(@JsonProperty("id")           Long   id,          @JsonProperty("truck_name")  String truckName,  @JsonProperty("truck_type")        String truckType,       @JsonProperty("truck_model") String truckModel, @JsonProperty("truck_registration_no") String truckRegistrationNumber,
			         @JsonProperty("truck_driver") String truckDriver, @JsonProperty("truck_owner") String truckOwner, @JsonProperty("truck_owner_phone") String truckOwnerPhone, @JsonProperty("truck_color") String truckColor, @JsonProperty("goods_image")           String goodsImage,
			         @JsonProperty("capacity")     String capacity,    @JsonProperty("goods_type")  String goodsType,  @JsonProperty("from_address")      String fromAddress,     @JsonProperty("to_address")  String toAddress,  @JsonProperty("freight_charges")       String freightCharges,
			         @JsonProperty("truck_image")  String truckImage,  @JsonProperty("cdate")       Date   cDate) 
	{

		this.id = id;
		this.truckName = truckName;
		this.truckType = truckType;
		this.truckModel = truckModel;
		this.truckRegistrationNumber = truckRegistrationNumber;
		this.truckDriver = truckDriver;
		this.truckOwner = truckOwner;
		this.truckOwnerPhone = truckOwnerPhone;
		this.truckColor = truckColor;
		this.goodsImage = goodsImage;
		this.capacity = capacity;
		this.goodsType = goodsType;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.freightCharges = freightCharges;
		this.truckImage = truckImage;
		this.cDate = cDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTruckModel() {
		return truckModel;
	}

	public void setTruckModel(String truckModel) {
		this.truckModel = truckModel;
	}

	public String getTruckRegistrationNumber() {
		return truckRegistrationNumber;
	}

	public void setTruckRegistrationNumber(String truckRegistrationNumber) {
		this.truckRegistrationNumber = truckRegistrationNumber;
	}

	public String getTruckDriver() {
		return truckDriver;
	}

	public void setTruckDriver(String truckDriver) {
		this.truckDriver = truckDriver;
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

	public String getTruckColor() {
		return truckColor;
	}

	public void setTruckColor(String truckColor) {
		this.truckColor = truckColor;
	}

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
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

	public String getTruckImage() {
		return truckImage;
	}

	public void setTruckImage(String truckImage) {
		this.truckImage = truckImage;
	}

	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	
	

}
