package com.snycon.di_singlebean_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.snycon.bean.Employee;
import com.snycon.config.Spring_Config;

public class App {
    public static void main( String[] args ){
        
       ApplicationContext a = new AnnotationConfigApplicationContext(Spring_Config.class);
       Employee e = a.getBean(Employee.class); 
       System.out.println(e.getEmp_id());
       System.out.println(e.getEmp_name());
       System.out.println(e.getEmp_sal());
    }
}
