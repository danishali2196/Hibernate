package com.nt.dao;

import org.hibernate.Session;

import com.nt.entity.Project;
import com.nt.utility.HibernateUtil;

public class ProjectDAOImpl implements ProjectDAO {

	@Override
	public Project getProjectById(int projId) {
		Session ses=null;
		Project proj=null;
		
		//get session object 
		ses=HibernateUtil.getSession();
		//load object
		proj=ses.get(Project.class, projId);
		return proj;
	}

}
