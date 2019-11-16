package com.Marq.WorkMarq.domain;

public class Building {
	private String bName;
	private String bAbbrev;
	private String bAddress;
	private String bPhone;
	private int maxRooms;
	
	/**
	 * @param bName
	 * @param bAbbrev
	 * @param bAddress
	 * @param bPhone
	 * @param maxRooms
	 */
	
	public Building(String bName, String bAbbrev, String bAddress, String bPhone, int maxRooms) {
		super();
		this.bName = bName;
		this.bAbbrev = bAbbrev;
		this.bAddress = bAddress;
		this.bPhone = bPhone;
		this.maxRooms = maxRooms;
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

	public int getMaxRooms() {
		return maxRooms;
	}
	public void setMaxRooms(int maxRooms) {
		this.maxRooms = maxRooms;
	}
	@Override
	public String toString() {
		return "Building [bName=" + bName + ", bAbbrev=" + bAbbrev + ", bAddress=" + bAddress + ", bPhone=" + bPhone
				+ ", maxRooms=" + maxRooms + "]";
	}

}
