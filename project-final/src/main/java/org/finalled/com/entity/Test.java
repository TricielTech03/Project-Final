package org.finalled.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "vehicle_test")
public class Test {
	@Id
	/* */
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@Column(name = "truck_no")
	private String truckNo;
	
	@Column(name = "truck_name")
	private String truckName;
	
	
	@Column(name = "truck_type")
	private String truckType;
	
	@Column(name = "truck_main_image")
	private String truckMainImg;
	
	@Column(name = "truck_owner")
	private String truckOwner;
	
	@Column(name = "truck_owner_phone")
	private String truckOwnerPhone;
	
	@Column(name = "driver_id")
	private String driverId;
	
	@Column(name = "driver_name")
	private String diverName;
	
	@Column(name = "driver_mobile_no")
	private String driverMobileNumber;
	
	@Column(name = "vehicle_rating")
	private String vehicleRating;
	
	@Column(name = "favourite_status")
	private String favouriteStatus;
	
	@Column(name = "freight_charge")
	private String frieghtCharge;
	
	@Column(name = "lattitude")
	private String latitude;
	
	@Column(name = "longitude")
	private String longitude;
	
	@Column(name = "distance")
	private String distance;

	public Test() 
	{
		
	}

	public Test(@JsonProperty("id")                Long id,                 @JsonProperty("truck_no")       String truckNo,       @JsonProperty("truck_name")   String truckName, @JsonProperty("truck_type")       String truckType,          @JsonProperty("truck_main_image") String truckMainImg,  @JsonProperty("truck_owner")  String truckOwner,
			     @JsonProperty("truck_owner_phone") String truckOwnerPhone,  @JsonProperty("driver_id")      String driverId,      @JsonProperty("driver_name")  String diverName, @JsonProperty("driver_mobile_no") String driverMobileNumber, @JsonProperty("vehicle_rating")   String vehicleRating,
			    @JsonProperty("favourite_status")   String favouriteStatus,  @JsonProperty("freight_charge") String frieghtCharge, @JsonProperty("lattitude")    String latitude,  @JsonProperty("longitude")        String longitude,          @JsonProperty("distance")         String distance) {
		super();
		this.id = id;
		this.truckNo = truckNo;
		this.truckName = truckName;
		this.truckType = truckType;
		this.truckMainImg = truckMainImg;
		this.truckOwner = truckOwner;
		this.truckOwnerPhone = truckOwnerPhone;
		this.driverId = driverId;
		this.diverName = diverName;
		this.driverMobileNumber = driverMobileNumber;
		this.vehicleRating = vehicleRating;
		this.favouriteStatus = favouriteStatus;
		this.frieghtCharge = frieghtCharge;
		this.latitude = latitude;
		this.longitude = longitude;
		this.distance = distance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTruckNo() {
		return truckNo;
	}

	public void setTruckNo(String truckNo) {
		this.truckNo = truckNo;
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

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
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

	public String getVehicleRating() {
		return vehicleRating;
	}

	public void setVehicleRating(String vehicleRating) {
		this.vehicleRating = vehicleRating;
	}

	public String getFavouriteStatus() {
		return favouriteStatus;
	}

	public void setFavouriteStatus(String favouriteStatus) {
		this.favouriteStatus = favouriteStatus;
	}

	public String getFrieghtCharge() {
		return frieghtCharge;
	}

	public void setFrieghtCharge(String frieghtCharge) {
		this.frieghtCharge = frieghtCharge;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}	
	
}
