package com.Marq.WorkMarq.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Marq.WorkMarq.domain.Employee;
import com.Marq.WorkMarq.domain.EmployeeMapper;

@Component
public class EmployeeDAO {
	@Autowired
	EmployeeMapper employeeMapper;
	
	public EmployeeDAO() {
		
	}
	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();	
		employeeList = employeeMapper.getEmployeeList();
		return employeeList;
	}
	public void insertEmployee(Employee employee) {
		employeeMapper.insertEmployee(employee);
	}
	public Employee getEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeMapper.getEmployee(employee);
	}
	public void updateEmployee(Employee employee) {
		employeeMapper.updateEmployee(employee);
	}
	public Employee logInEmployee(Employee employee) {
		return employeeMapper.logInEmployee(employee);
	}

}
