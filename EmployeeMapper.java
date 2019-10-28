package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmployeeMapper {
	@Select("SELECT empNum, firstName, lastName, middleInit, phone, username, password FROM EMPLOYEE")
	List<Employee> getEmployeeList();
	
	@Select("SELECT empNum, firstName, lastName, middleInit, phone, username, password FROM EMPLOYEE where empNum = #{empNum}")
	Employee getEmployee(Employee employee);
	
	@Update("update employee set firstName = #{firstName}, lastName = #{lastName}, middleInit = #{middleInit}, phone = #{phone}, username = #{username}, password = #{password} where empNum = #{empNum}")
	void updateEmployee(Employee employee);
	
	@Insert("insert into employee(empNum, firstName, lastName, middleInit, username, phone, password) values (#{empNum}, #{firstName}, #{lastName}, #{middleInit}, #{phone}, #{username}, #{password})")
	void insertEmployee(Employee employee);
	
	@Select("SELECT empNum, firstName, lastName, middleInit, phone, username, password FROM EMPLOYEE where empNum = #{empNum} and password = #{password}")
	Employee logInEmployee(Employee employee);

}
