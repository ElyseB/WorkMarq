package com.example.demo.domain;

public class Employee {
	private int empNum;
	private String firstName;
	private String lastName;
	private String middleInit;
	private String phone;
	private String username;
	private String password;
	
	/**
	 * @param empNum
	 * @param firstName
	 * @param lastName
	 * @param middleInit
	 * @param phone
	 * @param username
	 * @param password 
	 */
	
	public Employee(int empNum, String firstName, String lastName, String middleInit, String phone, String password) {
		super();
		this.empNum = empNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInit = middleInit;
		this.phone = phone;
		this.password = password;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleInit() {
		return middleInit;
	}

	public void setMiddleInit(String middleInit) {
		this.middleInit = middleInit;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Employee [empNum=" + empNum + ", firstName=" + firstName + ", lastName=" + lastName + ", middleInit="
				+ middleInit + ", phone=" + phone + ", username=" + username + ", password=" + password + "]";
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
