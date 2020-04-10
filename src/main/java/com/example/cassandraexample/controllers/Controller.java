package com.example.cassandraexample.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cassandraexample.model.Company;
import com.example.cassandraexample.model.Employee;
import com.example.cassandraexample.repository.EmployeeRepository;
import com.example.cassandraexample.repository1.CompanyRepository;
import com.example.cassandraexample.services.Service;

@RestController
@RequestMapping("/organization")
public class Controller {

	@Autowired
	Service service;

	@PostMapping("/save-company")
	public ResponseEntity<String> saveCompany(@RequestBody com.example.cassandraexample.model.Company comp) {
		String response = service.saveCompany(comp);

		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PostMapping("/save-employee")
	public ResponseEntity<String> saveEmployees(@RequestBody Employee emp) {
		String response = service.saveEmployee(emp);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@GetMapping("/get-employee")
	public ResponseEntity<List<Employee>> getEmployees() {
		List<Employee> list = service.getEmployee();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}

	@GetMapping("/get-company")
	public ResponseEntity<List<Company>> getCompany() {
		List<Company> list = service.getCompany();
		return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
	}
}
