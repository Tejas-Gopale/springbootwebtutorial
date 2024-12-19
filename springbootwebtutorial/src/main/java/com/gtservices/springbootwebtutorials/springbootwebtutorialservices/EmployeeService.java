package com.gtservices.springbootwebtutorials.springbootwebtutorialservices;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.gtservices.springbootwebtutorials.springbootwebtutorial.dto.EmployeeDto;
import com.gtservices.springbootwebtutorials.springbootwebtutorial.entity.EmployeeEntity;
import com.gtservices.springbootwebtutorials.springbootwebtutorial.repository.EmployeeRepository;

@Service
public class EmployeeService {

	//inject the Repository in the Service Layer
	private final EmployeeRepository employeeRepository;
	
	//inject model mapper we are dependent on the Model Mapper
	private final ModelMapper modelMapper;
	
	//Construction injection 
	public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
		this.employeeRepository = employeeRepository;
		this.modelMapper = modelMapper;
	}
	
	//constructor Injection of Model Mapper
	public 
	
	//get the Employee By Id.
	public EmployeeDto getEmployeeById(Long id) {
		EmployeeEntity employeeEntity= employeeRepository.findById(id).orElse(null);
		return modelMapper.map(employeeEntity,EmployeeDto.class);
	}
	
	//find All
	public List<EmployeeDto> getAllEmployee(){
		List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
	return employeeEntities.stream().map(employeeEntity -> modelMapper.map(employeeEntities, EmployeeDto.class)).collect(Collectors.toList());	
	}
	
	//Create the Employee
	public EmployeeDto createNewEmployee(EmployeeDto inputEmployee) {
		EmployeeEntity toSaveEntity = modelMapper.map(inputEmployee, EmployeeEntity.class);
		EmployeeEntity saveEmployeeEntity = employeeRepository.save(toSaveEntity);
		return modelMapper.map(saveEmployeeEntity, EmployeeDto.class);
	}
	
}
