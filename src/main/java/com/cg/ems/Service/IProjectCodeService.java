package com.cg.ems.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ems.Bean.ProjectCodeModule;


@Service
public interface IProjectCodeService {

	void addDetails(ProjectCodeModule pcm);

	void updateDetails(ProjectCodeModule pcm);

	List<ProjectCodeModule> getAllDetails();

	ProjectCodeModule getDetail(int projectId);

}
