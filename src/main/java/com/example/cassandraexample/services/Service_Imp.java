package com.example.cassandraexample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.cassandraexample.model.Company;
import com.example.cassandraexample.model.Employee;
import com.example.cassandraexample.repository.EmployeeRepository;
import com.example.cassandraexample.repository1.CompanyRepository;

@Component
public class Service_Imp implements Service {

	@Autowired
	CompanyRepository companyRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String saveEmployee(Employee employee) {

		employeeRepository.save(employee);
		return "employee data saveed!";

	}

	@Override
	public List<Employee> getEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public String saveCompany(Company company) {
		companyRepository.save(company);
		return "company data saved!!";

	}

	@Override
	public List<Company> getCompany() {
		return companyRepository.findAll();

	}

}
