package com.balajee.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repo;
	
	@Autowired
	public DatabaseLoader(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}

	public void run(String... strings) throws Exception {
		  this.repo.save(new Employee("Irul Chandrasekaran", 32, 9));
	        this.repo.save(new Employee("Balajee SR", 29, 8));
	        this.repo.save(new Employee("Alex Andrew", 34, 12));
	        this.repo.save(new Employee("Bob Boston ", 33, 2));
		
	}
	

}
