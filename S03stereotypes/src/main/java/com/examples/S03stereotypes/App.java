package com.examples.S03stereotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S03stereotypes.bean.Address;
import com.examples.S03stereotypes.bean.Instructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S03stereotypes/springconfig.xml");
        Instructor instructor=(Instructor)ctx.getBean("instructor");
        System.out.println(instructor);
        Address address=(Address)ctx.getBean("address");
        System.out.println(address);
    }
}
