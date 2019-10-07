package com.nt.service;

import com.nt.dao.ProjectDAO;
import com.nt.dao.ProjectDAOImpl;
import com.nt.dto.ProjectDTO;
import com.nt.entity.Project;

public class ProjectServiceImpl implements ProjectService {
	private ProjectDAO dao;
	
	public ProjectServiceImpl() {
		dao=new ProjectDAOImpl();
	}

	@Override
	public ProjectDTO searchProjectById(int projId) {
		Project proj=null; 
		ProjectDTO dto=null;
		
		proj=dao.getProjectById(projId);
		
		if(proj != null) {
			dto=new ProjectDTO();
			dto.setProjId(proj.getProjId());
			dto.setProjName(proj.getProjName());
			dto.setTeamSize(proj.getTeamSize());
			dto.setDomain(proj.getDomain());
			dto.setSdp(proj.getSdp());
			dto.setEdcp(proj.getEdcp());
			
		}
		return dto;
		
	}

}
