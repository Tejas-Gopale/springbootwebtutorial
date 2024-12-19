package com.gtservices.springbootwebtutorials.springbootwebtutorial.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

private Long id;
	
	private String name;
	
	private String email;
	
	private int age;
	
	private LocalDate dateOfJoining;
	
	private Boolean isActive;
}
