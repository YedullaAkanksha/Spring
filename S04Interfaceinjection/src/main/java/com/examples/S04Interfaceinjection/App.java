package com.examples.S04Interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.examples.S03stereotypes.bean.Instructor;
import com.examples.S04Interfaceinjection.service.OrderService;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S04Interfaceinjection/springconfig.xml");
        OrderService orderservice=(OrderService)ctx.getBean("orderservice");
        		
        orderservice.placeOrder();
    }
}
