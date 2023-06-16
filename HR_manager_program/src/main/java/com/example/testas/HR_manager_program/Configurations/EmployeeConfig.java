package com.example.testas.HR_manager_program.Configurations;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.testas.HR_manager_program.Entities.Employee;
import com.example.testas.HR_manager_program.Repositories.EmployeeRepository;

@Configuration
public class EmployeeConfig {

	@Bean
	CommandLineRunner employeeCommandLineRunner(EmployeeRepository repository) {
		return args -> {
			Employee josh = new Employee(1,"Josh",100,1000,"test",1000.0);
			Employee alex = new Employee(2,"Alex",100,1000,"test",1000.0);
			
			repository.saveAll(List.of(josh, alex));
		};
	}
}
