package com.course.Application.Dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.Application.Entity.Employee;

public interface EmployeeDto extends JpaRepository<Employee, Long>
{

}
