package com.course.Application.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.Application.Dto.EmployeeDto;
import com.course.Application.Entity.Employee;
import com.course.Application.Service.EmployeeSerrvice;

@Service
public class EmployeeImpl implements EmployeeSerrvice 
{
	@Autowired
	private EmployeeDto employeeDto;

	@Override
	public Employee creatEmployee(Employee employee) 

	{
		this.employeeDto.save(employee);
		return employee;
	}

}
