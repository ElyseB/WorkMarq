package com.Marq.WorkMarq.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Marq.WorkMarq.dao.EmployeeDAO;
import com.Marq.WorkMarq.domain.Employee;

@Component
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		
	}
	public List<Employee> getEmployeeList(){
		List<Employee> employeeList = new ArrayList <Employee>();
		employeeList = employeeDAO.getEmployeeList();
		return employeeList;
	}
	public void insertEmployee(Employee employee) {
		employeeDAO.insertEmployee(employee);
	}
	public Employee getEmployee(Employee employee) {
		return employeeDAO.getEmployee(employee);
	}
	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);
	}
	public Employee logInEmployee(Employee employee) {
		return employeeDAO.logInEmployee(employee);
	}
}
