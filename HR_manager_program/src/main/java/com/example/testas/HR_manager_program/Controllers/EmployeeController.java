package com.example.testas.HR_manager_program.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testas.HR_manager_program.Entities.Employee;
import com.example.testas.HR_manager_program.Services.EmployeeService;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
	
	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	
	@GetMapping
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	@PostMapping
	public void registerNewEmployee(@RequestBody Employee employee) {
		employeeService.addNewEmployee(employee);
	}
	
	@DeleteMapping("{studentId}")
	public void deleteEmployee(@PathVariable("studentId") Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
	
	@PutMapping(path = "{employeeId}")
	public void updateEmployee(
			@PathVariable("employeeId") Integer employeeId,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) Integer departmentId,
			@RequestParam(required = false) Integer projectId,
			@RequestParam(required = false) String role,
			@RequestParam(required = false) double salary) {
		employeeService.updateEmployee(employeeId, name, departmentId, projectId, role, salary);
	}
}
