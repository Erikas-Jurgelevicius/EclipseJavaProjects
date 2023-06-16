package com.example.testas.HR_manager_program.Services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.testas.HR_manager_program.Entities.Employee;
import com.example.testas.HR_manager_program.Repositories.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(@Qualifier("employee")EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@GetMapping
	public List<Employee> getEmployees() {

		return employeeRepository.findAll();
	}

	public void addNewEmployee(Employee employee) {
		Optional<Employee> studentOptional = employeeRepository.findById(employee.getEmployeeId());
		
		if(studentOptional.isPresent()) {
			throw new IllegalStateException("Employee with same ID already exists.");
		}
		employeeRepository.save(employee);
	}



	public void deleteEmployee(int employeeId) {
		boolean exists = employeeRepository.existsById(employeeId);
		
		if(!exists) {
			throw new IllegalStateException("Employee with id " + employeeId + " does not exist.");
		}
		employeeRepository.deleteById(employeeId);
	}


	@Transactional
	public void updateEmployee(Integer employeeId, String name, Integer departmentId, Integer projectId, String role, double salary) {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new IllegalStateException("Student with id " + employeeId + " does not exist."));
		
		if(name != null 
				&& name.length() > 0 
				&& !Objects.equals(employee.getName(), name)) {
			employee.setName(name);
		}
		
	}

}
