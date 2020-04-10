package com.example.cassandraexample.services;

import java.util.List;

import com.example.cassandraexample.model.Company;
import com.example.cassandraexample.model.Employee;

@org.springframework.stereotype.Service
public interface Service {

	public String saveEmployee(Employee employee);

	public List<Employee> getEmployee();

	public String saveCompany(Company company);

	public List<Company> getCompany();


}
