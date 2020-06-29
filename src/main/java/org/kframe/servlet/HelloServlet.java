package org.kframe.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.jasper.servlet.JspServlet;

public class HelloServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 407766488286844821L;

	@Override
	public void init() throws ServletException {
		System.out.println("init success ....");
		super.init();
	}
	
	
}
