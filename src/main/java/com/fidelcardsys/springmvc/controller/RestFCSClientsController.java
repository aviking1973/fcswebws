package com.fidelcardsys.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fidelcardsys.springmvc.model.Employee;
import com.fidelcardsys.springmvc.service.EmployeeService;

@RestController
public class RestFCSClientsController {
	
	@Autowired
	EmployeeService service;
	
	// -------------------Retrieve All Users--------------------------------------------------------
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> listAllEmployees() {
		
		List<Employee> employees = service.findAllEmployees();
		
		HttpStatus status = employees != null & employees.isEmpty() ? 
					HttpStatus.OK : HttpStatus.NOT_FOUND;
		
		return new ResponseEntity<List<Employee>>(employees, status);		
	}
}
