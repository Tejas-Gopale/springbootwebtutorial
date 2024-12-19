package com.gtservices.springbootwebtutorials.springbootwebtutorial.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gtservices.springbootwebtutorials.springbootwebtutorial.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
//	List<EmployeeEntity> findByName();
}
