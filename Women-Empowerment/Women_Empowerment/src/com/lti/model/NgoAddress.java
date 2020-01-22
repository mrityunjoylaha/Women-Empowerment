package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component("ngoAddress")
@Entity
@Table(name = "NGO_Addr")
public class NgoAddress {
	@Id
	@Column(name = "NGO_addr_Id")
	private int addressId;
	@Column(name = "building_name")
	private String buildingName;
	@Column(name = "street_name")
	private String streetName;
	@Column(name = "landmark")
	private String landmark;
	@Column(name = "state")
	private String state;
	@Column(name = "district")
	private String district;
	@Column(name = "city")
	private String city;
	@Column(name = "pincode")
	private String pincode;

	@JoinColumn(name = "ngoid")
	private NgoDetails ngoDetails;

	public NgoAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NgoAddress(int addressId, String buildingName, String streetName, String landmark, String state,
			String district, String city, String pincode, NgoDetails ngoDetails) {
		super();
		this.addressId = addressId;
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.landmark = landmark;
		this.state = state;
		this.district = district;
		this.city = city;
		this.pincode = pincode;
		this.ngoDetails = ngoDetails;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public NgoDetails getNgoDetails() {
		return ngoDetails;
	}

	public void setNgoDetails(NgoDetails ngoDetails) {
		this.ngoDetails = ngoDetails;
	}

	@Override
	public String toString() {
		return "NgoAddress [addressId=" + addressId + ", buildingName=" + buildingName + ", streetName=" + streetName
				+ ", landmark=" + landmark + ", state=" + state + ", district=" + district + ", city=" + city
				+ ", pincode=" + pincode + ", ngoDetails=" + ngoDetails + "]";
	}

}
