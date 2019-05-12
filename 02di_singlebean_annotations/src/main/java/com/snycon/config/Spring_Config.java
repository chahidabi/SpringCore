package com.snycon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.snycon.bean.Employee;

@Configuration
//it will make class as the configuration class
public class Spring_Config {
	
	@Bean
/*it is always used in configuration class and it is applied on method which is returns object
and it is managed by the spring context*/	
	public Employee get_emp_details() {
		Employee e = new Employee();
		e.setEmp_id(101);
		e.setEmp_name("chahida");
		e.setEmp_sal(50000.2);
		return e;
	}

}
