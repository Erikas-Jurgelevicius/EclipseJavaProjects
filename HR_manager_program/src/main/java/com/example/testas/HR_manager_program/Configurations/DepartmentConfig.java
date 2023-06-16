package com.example.testas.HR_manager_program.Configurations;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.testas.HR_manager_program.Entities.Department;
import com.example.testas.HR_manager_program.Repositories.DepartmentRepository;

@Configuration
public class DepartmentConfig {

	@Bean
	CommandLineRunner departmentCommandLineRunner(DepartmentRepository repository) {
		return args -> {
			Department dept1 = new Department(100,"Test",1);
			Department dept2 = new Department(101,"Test",2);
			
			repository.saveAll(List.of(dept1, dept2));
		};
	}
}
