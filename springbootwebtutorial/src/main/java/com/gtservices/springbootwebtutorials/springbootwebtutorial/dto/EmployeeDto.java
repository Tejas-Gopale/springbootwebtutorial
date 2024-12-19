package com.gtservices.springbootwebtutorials.springbootwebtutorial.dto;

import java.time.LocalDate;

//there is no any specific annotation for the DTO 
public class EmployeeDto {

	private Long id;
	
	private String name;
	
	private String email;
	
	private int age;
	
	private LocalDate dateOfJoining;
	
	private Boolean isActive;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDto(Long id, String name, String email, int age, LocalDate dateOfJoining, Boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", dateOfJoining="
				+ dateOfJoining + ", isActive=" + isActive + "]";
	}

	
	
	
}
