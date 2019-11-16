package com.Marq.WorkMarq;

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

import com.Marq.WorkMarq.domain.Employee;
import com.Marq.WorkMarq.service.EmployeeService;
import com.Marq.WorkMarq.domain.Building;
import com.Marq.WorkMarq.service.BuildingService;
import com.Marq.WorkMarq.domain.Reservation;
import com.Marq.WorkMarq.service.ReservationService;


@Controller
public class SiteController {
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	BuildingService buildingService;
	@Autowired
	ReservationService reservationService;
	
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
		employee = employeeService.getEmployee(employee);
		System.out.println("after getEmployee"+employee);
		model.addAttribute("employee", employee);
		return "editEmployee";		
	}
	//Log In
	@RequestMapping(value = "/logIn", method = RequestMethod.GET)
	public String login(@ModelAttribute Employee employee, Model model) {
		return "logIn";
	}
	//Processing Log In Page
	@RequestMapping(value = "/processLogIn", method = RequestMethod.POST)
	 public String processLogin(@RequestParam String empNum, String firstName, String supervisorNum, @ModelAttribute Employee employee, Model model) {
    	employee = employeeService.logInEmployee(employee);
    	System.out.println(employee);
    	model.addAttribute("message","Hello " + employee.getFirstName() + ", what would you like to do?");
    	model.addAttribute("empNum", employee.getEmpNum());
    	model.addAttribute("supervisorNum", employee.getSupervisorNum());
    	model.addAttribute(employee);
    	if(employee.getSupervisorNum() == 0) {
    		return "welcomeS";
    	}
    	else
    		return "welcome";
    }
	//Building Table
	@GetMapping("/buildings")
	public String getBuildings(Model model) {
		System.out.println("inside /buildings");
		List<Building> buildingList = new ArrayList<Building>();
		buildingList = buildingService.getBuildingList();
		model.addAttribute("buildingList", buildingList);
		return "buildingLanding";
	}
	//Reservation Table
		@GetMapping("/reservations")
		public String getReservations(Model model) {
			System.out.println("inside /reservations");
			List<Reservation> reservationList = new ArrayList<Reservation>();
			reservationList = reservationService.getReservationList();
			model.addAttribute("reservationList", reservationList);
			return "reservationLanding";
		}
	

}
