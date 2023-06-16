package com.example.testas.HR_manager_program.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testas.HR_manager_program.Services.ProjectService;

@RestController
@RequestMapping("api/v1/project")
public class ProjectController {

	
	private final ProjectService projectService;

	@Autowired
	public ProjectController(ProjectService projectService) {
		super();
		this.projectService = projectService;
	}
	
	@GetMapping
	public String hello() {
		return "Hello from ProjectController";
	}
	
}
