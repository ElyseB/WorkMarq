package com.Marq.WorkMarq.domain;

import java.sql.Date;

public class Reservation {
	private int reservNum;
	private String orgName;
	private String contactName;
	private String contactPhone;
	private String occupies;
	private Date reservStart;
	private Date reservEnd;
	private int roomsNeeded;
	
	/**
	 * @param reservNum
	 * @param orgName
	 * @param contactName
	 * @param contactPhone
     * @param occupies
     * @param reservStart
     * @param reservEnd
     * @param roomsNeeded
	 */
	
	public Reservation(int reservNum, String orgName, String contactName, String contactPhone, String occupies,
			Date reservStart, Date reservEnd, int roomsNeeded) {
		super();
		this.reservNum = reservNum;
		this.orgName = orgName;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.occupies = occupies;
		this.reservStart = reservStart;
		this.reservEnd = reservEnd;
		this.roomsNeeded = roomsNeeded;
	}
	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	public int getReservNum() {
		return reservNum;
	}
	public void setReservNum(int reservNum) {
		this.reservNum = reservNum;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getOccupies() {
		return occupies;
	}
	public void setOccupies(String occupies) {
		this.occupies = occupies;
	}
	public Date getReservStart() {
		return reservStart;
	}
	public void setReservStart(Date reservStart) {
		this.reservStart = reservStart;
	}
	public Date getReservEnd() {
		return reservEnd;
	}
	public void setReservEnd(Date reservEnd) {
		this.reservEnd = reservEnd;
	}
	public int getRoomsNeeded() {
		return roomsNeeded;
	}
	public void setRoomsNeeded(int roomsNeeded) {
		this.roomsNeeded = roomsNeeded;
	}
	@Override
	public String toString() {
		return "Reservation [reservNum=" + reservNum + ", orgName=" + orgName + ", contactName=" + contactName
				+ ", contactPhone=" + contactPhone + ", occupies=" + occupies + ", reservStart=" + reservStart
				+ ", reservEnd=" + reservEnd + ", roomsNeeded=" + roomsNeeded + "]";
	}
}
