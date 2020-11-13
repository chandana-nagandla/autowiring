package com.autowiring.aw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class readconfigfile {
	public static void main(String args[]) {
		   ApplicationContext con = new ClassPathXmlApplicationContext("employee.xml");
		   employee st =con.getBean("emp" , employee.class);
		   st.empinfo();
		   
		   
	   }
}
