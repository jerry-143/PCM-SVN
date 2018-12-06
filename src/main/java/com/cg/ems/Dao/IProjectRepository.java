package com.cg.ems.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.Bean.ProjectCodeModule;


@Repository
public interface IProjectRepository extends JpaRepository<ProjectCodeModule, Integer> {
	
		

}
