package com.example.testas.HR_manager_program.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//@Entity
//@Table
public class Department {

	//@Id
	//@SequenceGenerator(
			//name = "department_sequence",
			//sequenceName = "department_sequence",
			//allocationSize = 1)
	//@GeneratedValue(
			//strategy = GenerationType.SEQUENCE,
			//generator = "department_sequence")
	private Integer departmentId;
	private String department_name;
	//@OneToOne(mappedBy="employee")
	private Integer managerId;
	//@OneToMany(mappedBy="employee")
	private List<Department> listOfEmployees = new ArrayList<>();
	
	public Department() {
		super();
	}
	
	public Department(Integer departmentId, String department_name, Integer managerId) {
		super();
		this.departmentId = departmentId;
		this.department_name = department_name;
		this.managerId = managerId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public List<Department> getListOfEmployees() {
		return listOfEmployees;
	}
	public void setListOfEmployees(List<Department> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", department_name=" + department_name + ", managerId="
				+ managerId + "]";
	}
	
}
