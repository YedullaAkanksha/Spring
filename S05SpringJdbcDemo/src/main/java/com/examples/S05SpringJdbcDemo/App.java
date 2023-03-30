package com.examples.S05SpringJdbcDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.S05SpringJdbcDemo.dao.EmployeeDAO;
import com.examples.S05SpringJdbcDemo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "JDBC template" );
        //create();
       //update();
        //delete();
      // readOneEmployee();
       readAllEmployees();
    }

	private static void readAllEmployees() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
		 EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao");
		 List<Employee> emp=employeeDao.read();
		 System.out.println(emp);
	}

	private static void delete() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
	     EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao");
	      Employee emp=new Employee();
	     //emp.setId(1);
	     employeeDao.delete(2);
			
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
     EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao");
      Employee emp=new Employee();
    emp.setId(1);
     emp.setFirstName("Rich");
     emp.setLastName("smith2");
     employeeDao.update(emp);
		
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
//      s inserted: "+res);
       EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao");
        Employee emp=new Employee();
       emp.setId(1);
       emp.setFirstName("vicky");
       emp.setLastName("reddy");
       employeeDao.create(emp);
	}
	private static void readOneEmployee() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
       EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao");
        Employee emp=employeeDao.read(1);
       System.out.println(emp);
      
	}
	
}
