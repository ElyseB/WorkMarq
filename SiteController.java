package com.example.demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Employee;
import com.example.demo.service.EmployeeService;
@Controller
public class SiteController {
	
	@Autowired
	EmployeeService employeeService;
	
	//Employee Table
	@GetMapping("/employees")
	public String getEmployees(Model model) {
		System.out.println("inside /employees");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeService.getEmployeeList();
		model.addAttribute("employeeList", employeeList);
		return "employeeLanding";
	}
	//Edit Employee
	@GetMapping("/editEmployee/{empNum}")
	public String editEmployee(@PathVariable int empNum, @ModelAttribute Employee employee, Model model) {
		employee = new Employee();
		employee.setEmpNum(empNum);
		System.out.println("before getEmployee"+employee);
		
	}

}
