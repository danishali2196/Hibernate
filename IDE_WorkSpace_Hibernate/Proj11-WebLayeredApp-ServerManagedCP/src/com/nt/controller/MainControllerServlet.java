package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.ProjectDTO;
import com.nt.service.ProjectService;
import com.nt.service.ProjectServiceImpl;

public class MainControllerServlet extends HttpServlet {
		private ProjectService service=null;
	
		@Override
		public void init() throws ServletException {
			System.out.println("MainControllerServlet.init()");
				service=new ProjectServiceImpl();
		}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			int pid=0;
			ProjectDTO dto=null;
			RequestDispatcher rd=null;
			
			//read from data
			pid=Integer.parseInt(req.getParameter("projId"));
			//System.out.println(pid);
			dto=service.searchProjectById(pid);
			
			req.setAttribute("pDetails", dto);
			rd=req.getRequestDispatcher("/result.jsp");
			rd.forward(req, res);
	
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
			service=null;
	}

}
