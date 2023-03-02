package com.course.Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.Application.Entity.Employee;
import com.course.Application.Service.EmployeeSerrvice;

@RestController
@RequestMapping("/emp")
public class CourseConttroller
{

@Autowired
	private EmployeeSerrvice employeeSerrvice;
    // Post
	
	@PostMapping("/add")
public Employee creatEmployee (@RequestBody Employee employee) 
{
return this.employeeSerrvice.creatEmployee(employee);

}
	//Update
	
	// Get One
	
	//Get all
	
	// Delete by Id No.
}
