package com.example.testas.HR_manager_program.Services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.testas.HR_manager_program.Entities.Department;
import com.example.testas.HR_manager_program.Repositories.DepartmentRepository;

import jakarta.transaction.Transactional;

@Service
public class DepartmentService {

	private final DepartmentRepository departmentRepository;

	@Autowired
	public DepartmentService(@Qualifier("department")DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	@GetMapping
	public List<Department> getEmployees() {

		return departmentRepository.findAll();
	}

	public void addNewEmployee(Department department) {
		Optional<Department> departmentOptional = departmentRepository.findById(department.getDepartmentId());
		
		if(departmentOptional.isPresent()) {
			throw new IllegalStateException("Employee with same ID already exists.");
		}
		departmentRepository.save(department);
	}



	public void deleteEmployee(int employeeId) {
		boolean exists = departmentRepository.existsById(employeeId);
		
		if(!exists) {
			throw new IllegalStateException("Employee with id " + employeeId + " does not exist.");
		}
		departmentRepository.deleteById(employeeId);
	}


	@Transactional
	public void updateEmployee(Integer departmentId, String departmentName, Integer managerId) {
		Department department = departmentRepository.findById(departmentId)
				.orElseThrow(() -> new IllegalStateException("Student with id " + departmentId + " does not exist."));
		
		if(departmentName != null 
				&& departmentName.length() > 0 
				&& !Objects.equals(department.getDepartment_name(), departmentName)) {
			department.setDepartment_name(departmentName);
		}
		
	}
	
}
