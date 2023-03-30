package com.examples.S02Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S02Autowiring/springconfig.xml");
          Employee emp=(Employee)ctx.getBean("emp");
          System.out.println(emp);
//          
//          Address a1=(Address)ctx.getBean("add1");
//          System.out.println(a1);
//          
//          Address a2=(Address)ctx.getBean("add2");
//          System.out.println(a2);
    }
}
