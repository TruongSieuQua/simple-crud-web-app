package com.truon.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.truon.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
