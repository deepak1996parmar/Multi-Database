package com.example.cassandraexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CassandraExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraExampleApplication.class, args);
	}

}
