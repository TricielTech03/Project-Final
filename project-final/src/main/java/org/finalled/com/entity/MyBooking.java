package org.finalled.com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name="mybooking")
@SecondaryTables({
    @SecondaryTable(name="post_loads", pkJoinColumns={
        @PrimaryKeyJoinColumn(name="id", referencedColumnName="booking_id") }),
    
    
    @SecondaryTable(name="vehicle_list", pkJoinColumns={
        @PrimaryKeyJoinColumn(name="id", referencedColumnName="booking_id") })
})
public class MyBooking  {

    @Id
    @Column(name="booking_id")
    private Long bookingId;

    @Column(name = "truck_name",      table="vehicle_list")
	private String truckName;
    
    @Column(name="truck_type",        table="vehicle_list")
   	private String truckType;
   	
    @Column(name="truck_main_image",  table="vehicle_list")
   	private String truckMainImg;
   	
    @Column(name="truck_owner",       table="vehicle_list")
   	private String truckOwner;
   	
    @Column(name="truck_owner_phone", table="vehicle_list")
	private String truckOwnerPhone;
	
    
    @Column(name="driver_name",       table="vehicle_list")
	private String diverName;
    
    @Column(name="driver_mobile_no",  table="vehicle_list")
	private String driverMobileNumber;
   	
	
	
	
   	
    

  
    @Column(name="goods_photo",   table="post_loads")
	private String goodsPhoto;
	
	
    @Column(name="from_address",   table="post_loads")
	  private String fromAddress;
	 
	
    @Column(name="to_address",     table="post_loads")
	private String toAddress;
	
    @Column(name="capacity",       table="post_loads")
    private String capacity;

    @Column(name="freight_charges", table="post_loads")
    private String freightCharges;

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
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
