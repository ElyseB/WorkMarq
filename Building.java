package com.example.demo.domain;

public class Building {
	private String bName;
	private String bAbbrev;
	private String bAddress;
	private String bPhone;
	
	/**
	 * @param bName
	 * @param bAbbrev
	 * @param bAddress
	 * @param bPhone
	 */
	
	public Building(String bName, String bAbbrev, String bAddress, String bPhone) {
		super();
		this.bName = bName;
		this.bAbbrev = bAbbrev;
		this.bAddress = bAddress;
		this.bPhone = bPhone;
	}
	public Building() {
		// TODO Auto-generated constructor stub
	}
	public String getbName() {
		return bName;
	}	
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAbbrev() {
		return bAbbrev;
	}
	public void setbAbbrev(String bAbbrev) {
		this.bAbbrev = bAbbrev;
	}
	public String getbAddress() {
		return bAddress;
	}
	public void setbAddress(String bAddress) {
		this.bAddress = bAddress;
	}
	public String getbPhone() {
		return bPhone;
	}
	public void setbPhone(String bPhone) {
		this.bPhone = bPhone;
	}

	@Override
	public String toString() {
		return "Building [bName=" + bName + ", bAbbrev=" + bAbbrev + ", bAddress=" + bAddress + ", bPhone=" + bPhone
				+ "]";
	}
}
