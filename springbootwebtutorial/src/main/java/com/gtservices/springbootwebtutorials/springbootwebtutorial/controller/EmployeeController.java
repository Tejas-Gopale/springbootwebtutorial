package com.gtservices.springbootwebtutorials.springbootwebtutorial.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gtservices.springbootwebtutorials.springbootwebtutorial.dto.EmployeeDto;
import com.gtservices.springbootwebtutorials.springbootwebtutorial.entity.EmployeeEntity;
import com.gtservices.springbootwebtutorials.springbootwebtutorial.repository.EmployeeRepository;
import com.gtservices.springbootwebtutorials.springbootwebtutorialservices.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController // It will 
public class EmployeeController {

//	@GetMapping(path = "/getmessage")
//	public String getMysuperMessage() {
//		return "Secreat Message   : sndbfsd@12##12";
//	}
	
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping(path = "/{employeeId}")
	public EmployeeEntity getEmployeeById(@PathVariable (name = "employeeId")Long id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping()
	public List<EmployeeEntity> getAllEmployee(@RequestParam(required = false, name ="inputAge")
					Integer age, @RequestParam(required = false)String sortBy){
									return employeeService.getAllEmployee();
	}
	
	@PostMapping()
	public EmployeeEntity createNeEmployee(@RequestBody EmployeeEntity inputEmployee) {
		return employeeService.createNewEmployee(inputEmployee);
	}
	
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
