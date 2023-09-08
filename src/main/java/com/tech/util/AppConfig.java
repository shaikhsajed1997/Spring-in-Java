package com.tech.util;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "com.tech")
@Configuration
public class AppConfig {

	@Bean
	public InternalResourceViewResolver viewResolve() {

		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");

		return irvr;
	}

	@Bean
	public DriverManagerDataSource dmds() {

		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setDriverClassName("com.mysql.jdbc.Driver");
		dms.setUrl("jdbc:mysql://localhost:3306/springcustomer");
		dms.setUsername("root");
		dms.setPassword("root");

		return dms;

	}

	@Bean
	public LocalSessionFactoryBean sf() {

		LocalSessionFactoryBean lsf = new LocalSessionFactoryBean();
		lsf.setDataSource(dmds());

		Properties p = new Properties();
		p.setProperty("org.hibernate.dialect.MySQL55Dialect", "hibernate.dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");

		lsf.setHibernateProperties(p);
		
		lsf.setAnnotatedClasses(com.tech.model.Customer.class);

		return lsf;

	}

}
