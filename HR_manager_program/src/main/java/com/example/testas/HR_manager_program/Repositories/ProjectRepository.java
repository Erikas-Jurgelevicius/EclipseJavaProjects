package com.example.testas.HR_manager_program.Repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testas.HR_manager_program.Entities.Project;

@Repository
@Qualifier("project")
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
