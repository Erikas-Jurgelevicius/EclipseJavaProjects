package com.example.testas.HR_manager_program.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@SequenceGenerator(
			name = "employee_sequence",
			sequenceName = "employee_sequence",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "employee_sequence")
	private int employeeId;
	private String name;
	//@ManyToOne
	//@JoinColumn(name="department_id")
	private Integer departmentId;
	//@ManyToOne
	//@JoinColumn(name="project_id")
	private Integer projectId;
	private String role;
	private double salary;	
	
	public Employee() {
		super();
	}
	
	public Employee(Integer employeeId, String name, Integer departmentId, Integer projectId, String role, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.departmentId = departmentId;
		this.projectId = projectId;
		this.role = role;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", departmentId=" + departmentId
				+ ", projectId=" + projectId + ", role=" + role + ", salary=" + salary + "]";
	}
	
}
