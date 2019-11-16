package com.Marq.WorkMarq.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmployeeMapper {
	@Select("SELECT empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum FROM EMPLOYEE")
	List<Employee> getEmployeeList();
	
	@Select("SELECT empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum FROM EMPLOYEE where empNum = #{empNum}")
	Employee getEmployee(Employee employee);
	
	@Update("update employee set firstName = #{firstName}, lastName = #{lastName}, middleInit = #{middleInit}, phone = #{phone}, username = #{username}, pass = #{pass}, supervisorNum = #{supervisorNum} where empNum = #{empNum}")
	void updateEmployee(Employee employee);
	
	@Insert("insert into employee(empNum, firstName, lastName, middleInit, username, phone, pass, supervisorNum) values (#{empNum}, #{firstName}, #{lastName}, #{middleInit}, #{phone}, #{username}, #{pass}, #{supervisorNum})")
	void insertEmployee(Employee employee);
	
	@Select("SELECT empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum FROM EMPLOYEE where empNum = #{empNum} and pass = #{pass}")
	Employee logInEmployee(Employee employee);

}
