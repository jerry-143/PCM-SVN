package com.cg.ems.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.Bean.ProjectCodeModule;
import com.cg.ems.Dao.IProjectRepository;

@Service
public class ProjectCodeServiceImpl implements IProjectCodeService{

	@Autowired
	IProjectRepository projectRepository;
	
	// Add Project Details
	@Transactional
	@Override
	public void addDetails(ProjectCodeModule pcm) {
		
		projectRepository.save(pcm);
		
	}

	@Override
	public void updateDetails(ProjectCodeModule pcm) {
		
		projectRepository.save(pcm);
		
	}

	@Override
	public List<ProjectCodeModule> getAllDetails() {

	
		return projectRepository.findAll();
		
	}

	@Override
	public ProjectCodeModule getDetail(int projectId) {
	
		ProjectCodeModule pcm = projectRepository.findById(projectId).get();
		
		return pcm;
	}

}
