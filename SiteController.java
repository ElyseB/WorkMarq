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
import com.Marq.WorkMarq.domain.OffDays;
import com.Marq.WorkMarq.service.EmployeeService;
import com.Marq.WorkMarq.service.OffDaysService;
import com.Marq.WorkMarq.domain.Building;
import com.Marq.WorkMarq.domain.ColorWeeks;
import com.Marq.WorkMarq.service.BuildingService;
import com.Marq.WorkMarq.service.ColorWeeksService;
import com.Marq.WorkMarq.domain.Reservation;
import com.Marq.WorkMarq.service.ReservationService;
import com.Marq.WorkMarq.service.SSOLinesService;
import com.Marq.WorkMarq.domain.Timeoff;
import com.Marq.WorkMarq.service.TimeoffService;
import com.Marq.WorkMarq.service.YearRotationService;

@Controller
public class SiteController {

	@Autowired
	BuildingService buildingService;
	@Autowired
	ColorWeeksService colorWeeksService;
	@Autowired
	EmployeeService employeeService;
	@Autowired
	OffDaysService offDaysService;
	@Autowired
	ReservationService reservationService;
	@Autowired
	SSOLinesService ssoLinesService;
	@Autowired
	TimeoffService timeoffService;
	@Autowired
	YearRotationService yearRotationService;

	/*
	 * Methods related to employee and supervisor attributes
	 * 
	 */

	// Employee Table
	@GetMapping("/employees")
	public String getEmployees(Model model) {
		System.out.println("inside /employees");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeService.getEmployeeList();
		model.addAttribute("employeeList", employeeList);
		System.out.println(employeeList);
		return "employeeLanding";
	}

	// Edit Employee
	@GetMapping("/editEmp/{empNum}")
	public String editEmployee(@PathVariable int empNum, @ModelAttribute Employee employee, Model model) {
		employee = new Employee();
		employee.setEmpNum(empNum);
		System.out.println("before getEmployee" + employee);
		employee = employeeService.getEmployee(employee);
		System.out.println("after getEmployee" + employee);
		model.addAttribute("employee", employee);
		return "editEmp";
	}

	// Update Employee
	@RequestMapping(value = "/updateEmp", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute Employee employee, Model model) {
		employeeService.updateEmployee(employee);
		model.addAttribute("message", "success. employee updated.");
		getEmployees(model);
		return "employeeLanding";
	}

	// Add Employee
	@RequestMapping(value = "/addEmp/{empNum}", method = RequestMethod.GET)
	public String addEmp(@ModelAttribute Employee employee, Model model) {
		employee = new Employee();
		model.addAttribute(employee);
		return "addEmp";
	}

	// Processing Add Employee
	@RequestMapping(value = "/processAddEmp", method = RequestMethod.POST)
	public String processAddEmp(@RequestParam String empNum, String firstName, String lastNameame, String middleInit,
			String phone, String username, String pass, String supervisorNum, @ModelAttribute Employee employee,
			Model model) {
		employeeService.insertEmployee(employee);
		getEmployees(model);
		return "employeeLanding";
	}
	// TODO Remove Employee

	// Log In
	@RequestMapping(value = "/logIn", method = RequestMethod.GET)
	public String login(@ModelAttribute Employee employee, Model model) {
		return "logIn";
	}

	// Processing Log In Page
	@RequestMapping(value = "/processLogIn", method = RequestMethod.POST)
	public String processLogin(@RequestParam String empNum, String firstName, String supervisorNum,
			@ModelAttribute Employee employee, Model model) {
		employee = employeeService.logInEmployee(employee);
		System.out.println(employee);
		model.addAttribute("message", "Hello " + employee.getFirstName() + ", what would you like to do?");
		model.addAttribute("empNum", employee.getEmpNum());
		model.addAttribute("supervisorNum", employee.getSupervisorNum());
		model.addAttribute(employee);
		if (employee.getSupervisorNum() == 0) {
			return "welcomeS";
		} else
			return "welcome";
	}
	@GetMapping("/training")
	public String getTraining(Model model) {
		System.out.println("inside /training");
		return "training";
	}
	@GetMapping("/hallMaps")
	public String getHallMaps(Model model) {
		System.out.println("inside /hallMaps");
		return "hallMaps";
	}

	/*
	 * Methods related to buildings and their attributes
	 * 
	 */

	// Building Table
	@GetMapping("/buildings")
	public String getBuildings(Model model) {
		System.out.println("inside /buildings");
		List<Building> buildingList = new ArrayList<Building>();
		buildingList = buildingService.getBuildingList();
		model.addAttribute("buildingList", buildingList);
		return "buildingLanding";
	}

	// Edit Building
	@GetMapping("/editBuilding/{bName}")
	public String editBuilding(@PathVariable String bName, @ModelAttribute Building building, Model model) {
		building = new Building();
		building.setbName(bName);
		System.out.println("before getBuilding" + building);
		building = buildingService.getBuilding(building);
		System.out.println("after getBuilding" + building);
		model.addAttribute("building", building);
		return "editBuilding";
	}

	// Update Building
	@RequestMapping(value = "/updateBuilding", method = RequestMethod.POST)
	public String updateBuilding(@ModelAttribute Building building, Model model) {
		buildingService.updateBuilding(building);
		model.addAttribute("message", "success. building updated.");
		getBuildings(model);
		return "buildingLanding";
	}

	// Add Building
	@RequestMapping(value = "/addBuilding/{empNum}", method = RequestMethod.GET)
	public String newBuilding(@ModelAttribute Building building, Model model) {
		building = new Building();
		model.addAttribute(building);
		return "addBuilding";
	}

	// Processing Add Building
	@RequestMapping(value = "/processAddBuilding", method = RequestMethod.POST)
	public String processNewBuilding(@RequestParam String bName, String bAbbrev, String bAddress, String bPhone,
			@ModelAttribute Building building, Model model) {
		buildingService.insertBuilding(building);
		getBuildings(model);
		return "buildingLanding";
	}
	// TODO Remove Building

	/*
	 * Methods related to reservations
	 * 
	 */

	// Reservation Table
	@GetMapping("/reservations")
	public String getReservations(Model model) {
		System.out.println("inside /reservations");
		List<Reservation> reservationList = new ArrayList<Reservation>();
		reservationList = reservationService.getReservationList();
		model.addAttribute("reservationList", reservationList);
		return "reservationLanding";
	}

	// Edit Reservation
	@GetMapping("/editReservation/{reservNum}")
	public String editReservation(@PathVariable int reservNum, @ModelAttribute Reservation reservation, Building building, Model model) {
		reservation = new Reservation();
		reservation.setReservNum(reservNum);
		System.out.println("before getReservation" + reservation);
		reservation = reservationService.getReservation(reservation);
		System.out.println("after getReservation" + reservation);
		model.addAttribute("reservation", reservation);
		List<Building> buildingList = new ArrayList<Building>();
		buildingList = buildingService.getBuildingList();
		model.addAttribute("buildingList", buildingList);
		return "editReservation";
	}

	// Update Reservation
	@RequestMapping(value = "/updateReservation", method = RequestMethod.POST)
	public String updateReservation(@ModelAttribute Reservation reservation, Model model) {
		reservationService.updateReservation(reservation);
		model.addAttribute("message", "success. reservation updated.");
		getReservations(model);
		return "reservationLanding";
	}

	// Add Reservation
	@RequestMapping(value = "/addReservation/{empNum}", method = RequestMethod.GET)
	public String addRes(@ModelAttribute Reservation reservation, Building building, Model model) {
		reservation = new Reservation();
		model.addAttribute(reservation);
		List<Building> buildingList = new ArrayList<Building>();
		buildingList = buildingService.getBuildingList();
		model.addAttribute("buildingList", buildingList);
		return "addReservation";
	}

	// Processing Add Reservation
	@RequestMapping(value = "/processAddRes", method = RequestMethod.POST)
	public String processAddRes(@RequestParam String orgName, String contactName, String contactPhone,
			String occupies, String reservStart, String reservEnd, String roomsNeeded,
			@ModelAttribute Reservation reservation, Model model) {
		reservationService.insertReservation(reservation);
		getReservations(model);
		return "reservationLanding";
	}
	// TODO Remove Reservation

	/*
	 * Methods related to time off
	 * 
	 */
	// Timeoff Table
	@GetMapping("/timeoffTable")
	public String getTimeoffTable(Model model) {
		System.out.println("inside /timeoffTable");
		List<Timeoff> timeoffList = new ArrayList<Timeoff>();
		timeoffList = timeoffService.getTimeoffList();
		model.addAttribute("timeoffList", timeoffList);
		return "timeoffLanding";
	}
	// Individual Time off
	@RequestMapping(value= "/myTimeoff/{empNum}", method = RequestMethod.GET)
	public String getMyTimeOff( @ModelAttribute Timeoff timeoff, Model model) {
		timeoff = timeoffService.getMyTimeoff(timeoff);
		System.out.println(timeoff);
		List<Timeoff> myTimeoffList = new ArrayList<Timeoff>();
		myTimeoffList = timeoffService.getMyTimeoffList(timeoff);
		model.addAttribute("myTimeoffList", myTimeoffList);
		model.addAttribute("empNum", timeoff.getEmpNum());
		return "myTimeoffLanding";
	}

	// Edit Timeoff
	@GetMapping("/editTimeoff/{empNum}")
	public String editTimeoff(@PathVariable int empNum, @ModelAttribute Timeoff timeoff, Model model) {
		timeoff = new Timeoff();
		timeoff.setEmpNum(empNum);
		System.out.println("before getTimeoff" + timeoff);
		timeoff = timeoffService.getTimeoff(timeoff);
		
		model.addAttribute("startDate", timeoff.getStartDate());
		System.out.println("after getTimeoff" + timeoff);
		model.addAttribute("timeoff", timeoff);
		
		return "editTimeoff";
	}

	// Update Timeoff
	@RequestMapping(value = "/updateTimeoff", method = RequestMethod.POST)
	public String updateTimeoff(@ModelAttribute Timeoff timeoff, Model model) {
		timeoffService.updateTimeoff(timeoff);
		model.addAttribute("message", "success. timeoff updated.");
		getTimeoffTable(model);
		return "timeoffLanding";
	}

	// Add Timeoff
	@RequestMapping(value = "/addTimeoff/{empNum}", method = RequestMethod.GET)
	public String newTimeoff(@ModelAttribute Timeoff timeoff, Model model) {
		timeoff = new Timeoff();
		model.addAttribute(timeoff);
		return "addTimeoff";
	}

	// Processing Add Timeoff
	@RequestMapping(value = "/processAddTimeoff", method = RequestMethod.POST)
	public String processAddTimeoff(@RequestParam String empNum, String startDate, String endDate, String totalHours,
			String typeHoursUsed, @ModelAttribute Timeoff timeoff, Model model) {
		timeoffService.insertTimeoff(timeoff);
		getTimeoffTable(model);
		return "timeoffLanding";
	}
	// TODO Remove Timeoff
	
	
	// Schedule
		@RequestMapping(value= "/schedule", method= RequestMethod.GET)
		public String getOffDays(@ModelAttribute String lineLetter, ColorWeeks colorWeeks, OffDays offDays, Model model) {
			List<ColorWeeks> colorWeeksList = new ArrayList<ColorWeeks>();
			colorWeeksList = colorWeeksService.getColorWeeksList();
			//System.out.println(colorWeeksList);
			model.addAttribute("colorWeeksList", colorWeeksList);
			
			List<OffDays> offDaysList = new ArrayList<OffDays>();
			offDaysList = offDaysService.getOffDaysList();
			model.addAttribute("offDaysList", offDaysList);
			
			ColorWeeks colorWeeks2;
			OffDays offDays2;
			List<OffDays> colorDaysList = new ArrayList<OffDays>();
			for(int i = 0; i < colorWeeksList.size(); i++) {
				//System.out.println(colorWeeksList.get(i));
				colorWeeks2 = colorWeeksList.get(i);
				//offDays2
				lineLetter = colorWeeks2.getLineLetter();
				System.out.println(lineLetter);
				model.addAttribute("lineLetter", lineLetter);
				colorDaysList.addAll(offDaysService.getColorDaysList(colorWeeks2));
				//colorDaysList.add(offDays2);
				//colorWeeks = colorWeeksService.getColorWeeks(colorWeeks);
				//System.out.println(colorWeeks.getLineLetter());
			}
			//System.out.println(colorDaysList);
			
			//colorDaysList.a = offDaysService.getColorDaysList(colorWeeks);
			model.addAttribute("colorDaysList", colorDaysList);
			
			return "schedule";
		}
}
