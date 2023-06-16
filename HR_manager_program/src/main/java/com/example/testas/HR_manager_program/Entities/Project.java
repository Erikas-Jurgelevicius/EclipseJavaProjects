package com.example.testas.HR_manager_program.Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table
public class Project {

	//@Id
	//@SequenceGenerator(
			//name = "project_sequence",
			//sequenceName = "project_sequence",
			//allocationSize = 1)
	//@GeneratedValue(
			//strategy = GenerationType.SEQUENCE,
			//generator = "project_sequence")
	private Integer projectId;
	private String projectName;
	private LocalDate projectStartDate;
	private LocalDate projectDueDate;
	//@ManyToMany(mappedBy="employee")
	private List<Project> listOfEmployees = new ArrayList<>();
	
	public Project() {
		super();
	}
	
	public Project(Integer projectId, String projectName, LocalDate projectStartDate, LocalDate projectDueDate) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectStartDate = projectStartDate;
		this.projectDueDate = projectDueDate;
	}


	public Integer getProjectId() {
		return projectId;
	}



	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public LocalDate getProjectStartDate() {
		return projectStartDate;
	}



	public void setProjectStartDate(LocalDate projectStartDate) {
		this.projectStartDate = projectStartDate;
	}



	public LocalDate getProjectDueDate() {
		return projectDueDate;
	}



	public void setProjectDueDate(LocalDate projectDueDate) {
		this.projectDueDate = projectDueDate;
	}



	public List<Project> getListOfEmployees() {
		return listOfEmployees;
	}



	public void setListOfEmployees(List<Project> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}



	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectStartDate="
				+ projectStartDate + ", projectDueDate=" + projectDueDate + "]";
	}
	
	
}
