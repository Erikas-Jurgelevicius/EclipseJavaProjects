package com.example.testas.HR_manager_program.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.testas.HR_manager_program.Repositories.ProjectRepository;

@Service
public class ProjectService {

	private final ProjectRepository projectRepository;

	//@Autowired
	public ProjectService(@Qualifier("project")ProjectRepository projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}
	
	
}
