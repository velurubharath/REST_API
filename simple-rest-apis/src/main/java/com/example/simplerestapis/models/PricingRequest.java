package com.example.simplerestapis.models;

public class PricingRequest {
	
	private String name;
	private String mobile;
	private String email;
	private String numberOfTonnes;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumberOfTonnes() {
		return numberOfTonnes;
	}
	public void setNumberOfTonnes(String numberOfTonnes) {
		this.numberOfTonnes = numberOfTonnes;
	}

}
