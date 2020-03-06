package com.cts.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Buyers")
public class Buyer {

	@OneToOne
	private User user;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int buyerId;
	private String emailId;
	private String mobileNumber;
	@Embedded
	private Address address;
	private String createdDate;


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public Buyer(User user, int buyerId, String emailId, String mobileNumber, Address address, String createdDate) {
		super();
		this.user = user;
		this.buyerId = buyerId;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.createdDate = createdDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
