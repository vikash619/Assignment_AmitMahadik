package com.springCoreAssignment.Question10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CompanyName implements ApplicationContextAware {
	String companyName;
	ApplicationContext applicationContext;
	Employee employee;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public String getEmployeeName(String employeeBeanName) {
		employee = (Employee) applicationContext.getBean(employeeBeanName);
		String employeeName = employee.getEmployeeName();
		return employeeName;
	}

}
