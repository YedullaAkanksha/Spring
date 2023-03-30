package com.examples.S04Interfaceinjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaooracle")
public class OrderDaoOracleImp implements OrderDAO{
	@Override
	public void createOrder() {
		System.out.println("open oracle connection");
		System.out.println("create oracle connection");
	}

}
