package com.cts.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Sellers")
public class Seller {

	@OneToOne
	private User user;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sellerId;
	private String companyName;
	private String companyDescription;
	@Embedded
	private Address address;
	private String website;
	private String email;
	private String phone;



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDescription() {
		return companyDescription;
	}

	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Seller(User user, String companyName, String companyDescription, Address address, String website,
			String email, String phone) {
		super();
		this.user = user;
		this.companyName = companyName;
		this.companyDescription = companyDescription;
		this.address = address;
		this.website = website;
		this.email = email;
		this.phone = phone;
	}


}
