package com.example.demo.domain;

import java.sql.Date;

public class Timeoff {
	private String empNum;
	private Date startDate;
	private Date endDate;
	private int totalHours;
	private String typeHoursUsed;
	
	/**
	 * @param empNum
	 * @param startDate
	 * @param endDate
	 * @param totalHours
     * @param typeHoursUsed
	 */
	
    public Timeoff(String empNum, Date startDate, Date endDate, int totalHours, String typeHoursUsed,) {
		super();
		this.empNum = empNum;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalHours = totalHours;
		this.typeHoursUsed = typeHoursUsed;
	}
	public Timeoff() {
		// TODO Auto-generated constructor stub
	}
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.reservNum = reservNum;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	public String getTypeHoursUsed() {
		return totalHoursUsed;
	}
	public void setTypeHoursUsed(int typeHoursUsed) {
		this.typeHoursUsed = typeHoursUsed;
	}
	@Override
	public String toString() {
		return "Timeoff [empNum=" + empNum + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", totalHours=" + totalHours + ", typeHoursUsed=" + typeHoursUsed + "]";
	}
}