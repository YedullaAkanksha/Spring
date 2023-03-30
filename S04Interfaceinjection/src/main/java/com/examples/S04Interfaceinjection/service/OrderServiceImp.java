package com.examples.S04Interfaceinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.examples.S04Interfaceinjection.dao.OrderDAO;

@Component("orderservice")
public class OrderServiceImp implements OrderService{
	@Autowired
	@Qualifier("orderdaomysql")
	private OrderDAO orderdao;

	@Override
	public void placeOrder() {
		System.out.println("perform logic");
		System.out.println("ready to create order");
		orderdao.createOrder();
		//orderdao2.createOrder();
	}
	
	
	

}
