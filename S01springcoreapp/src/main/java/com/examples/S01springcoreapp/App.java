package com.examples.S01springcoreapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//demo1();
    	//demo2();
    	//demo3();
    	demo4();
    	
    }
    	
    	private static void demo4() {
		// TODO Auto-generated method stub
    		 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig4.xml");
    		 EmployeeDAO d=(EmployeeDAO)ctx.getBean("dao");
    	        System.out.println(d);
	}

		private static void demo1() {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig.xml");
        Employee emp1=(Employee)ctx.getBean("emp1");
        System.out.println(emp1);
        Employee emp2=(Employee)ctx.getBean("emp2");
        System.out.println(emp2);
        Employee emp3=(Employee)ctx.getBean("emp3");
        System.out.println(emp3);
        Employee emp4=(Employee)ctx.getBean("emp4");
        System.out.println(emp4);
        Employee emp5=(Employee)ctx.getBean("emp5");
        System.out.println(emp5);
        Employee emp6=(Employee)ctx.getBean("emp6");
        System.out.println(emp6);
        Employee add=(Employee)ctx.getBean("emp7");
       System.out.println(add);
        Employee emp8=(Employee)ctx.getBean("emp8");
        System.out.println(emp8);
    	}
    	
    	private static void demo2() {
            System.out.println( "Hello World!" );
            ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig2.xml");
            Car c1=(Car)ctx.getBean("car");
            System.out.println(c1.hashCode());
            
            Car c2=(Car)ctx.getBean("car");
            System.out.println(c2.hashCode());
            
            Bank b1=(Bank)ctx.getBean("bank");
            System.out.println(b1.hashCode());
            Bank b2=(Bank)ctx.getBean("bank");
            System.out.println(b2.hashCode());
            
    }
    	private static void demo3() {
            System.out.println( "Hello World!" );
            ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig3.xml");
            Computer c=(Computer)ctx.getBean("homecom");
            System.out.println(c);
            Computer o=(Computer)ctx.getBean("officecom");
            System.out.println(o);
            
    	}
}
