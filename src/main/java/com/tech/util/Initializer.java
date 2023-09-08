package com.tech.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		
		AnnotationConfigWebApplicationContext acwp=new AnnotationConfigWebApplicationContext();
		
		acwp.register(AppConfig.class);
		
		acwp.setServletContext(sc);
		
		ServletRegistration.Dynamic sd=sc.addServlet("DispatcherServlet", new DispatcherServlet(acwp));
		
		sd.addMapping("/");
		
	}

	
}
