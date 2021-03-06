package com.example.cassandraexample.repository1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cassandraexample.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
