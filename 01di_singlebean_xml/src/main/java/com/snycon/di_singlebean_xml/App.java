package com.snycon.di_singlebean_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snycon.bean.Employee;

public class App {
    public static void main( String[] args ){
        
    	ApplicationContext a = new ClassPathXmlApplicationContext("Spring_Config.xml");
    	Object obj = a.getBean("emp");
    	Employee e = (Employee)obj;
    	System.out.println("emp id is: "+e.getEmp_id());
    	System.out.println("emp name is: "+e.getEmp_name());
    	System.out.println("emp sal is: "+e.getEmp_sal());
    	
    }
}
