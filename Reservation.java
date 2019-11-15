  
package com.example.demo.domain;

public class Reservation {
	private String reservNum;
	private String orgName;
	private String contactName;
    private String contactPhone;
    private String occupies;
    private String reservStart;
    private String reservEnd;
    private String roomsNeeded;
	
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
	
	public Reservation(String reservNum, String orgName, String contactName, String contactPhone, String occupies, String reservStart, String reservEnd, String roomsNeeded) {
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
	public () {
		// TODO Auto-generated constructor stub
	}
	public String getreservNum() {
		return reservNum;
	}	
	public void setreservNum(String reservNum) {
		this.reservNum = reservNum;
	}
	public String getorgName() {
		return orgName;
	}
	public void setorgName(String orgName) {
		this.orgName = orgName;
	}
	public String getcontactName() {
		return contactName;
	}
	public void setcontactName(String contactName) {
		this.contactName = contactName;
	}
	public String getcontactPhone() {
		return contactPhone;
	}
	public void setcontactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
    }
    public String getoccupies() {
		return occupies;
	}
	public void setoccupies(String occupies) {
		this.occupies = occupies;
    }
    public String getreserveStart() {
		return reserveStart;
	}
	public void setreserveStart(String reserveStart) {
		this.reserveStart = reserveStart;
    }
    public String getreserveEnd() {
		return reserveEnd;
	}
	public void setreserveEnd(String reserveEnd) {
		this.reserveEnd = reserveEnd;
    }
    public String getroomsNeeded() {
		return roomsNeeded;
	}
	public void setroomsNeeded(String roomsNeeded) {
		this.roomsNeeded = roomsNeeded;
    }
    

	@Override
	public String toString() {
		return "Reservation [reservNum=" + reservNum + ", orgName=" + orgName + ", contactName=" + contactName + ", contactPhone=" + contactPhone
				+ ",occupies=" + occupies + ", reservStart=" + reservStart + ", reservEnd=" + reservEnd + ", roomsNeeded=" + roomsNeeded +"]";
	}
}