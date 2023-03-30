package com.examples.S04Interfaceinjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaomysql")
public class OrderDaoMYSQLImp implements OrderDAO {
	@Override
	public void createOrder() {
		System.out.println("open connection");
		System.out.println("create connection");
	}
}