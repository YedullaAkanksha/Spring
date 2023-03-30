package com.examples.S06SpringORMDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORMDemo.dao.ProductDao;
import com.examples.S06SpringORMDemo.entity.Product;


public class App 
{
    public static void main( String[] args )
    {
    	//create();
    	//update();
    	//delete();
    	//find();
    	findAll();
    }

	private static void findAll() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		 ProductDao productDao=(ProductDao)ctx.getBean("productdao");
		 List<Product> product=productDao.findAll();
		 System.out.println("products found "+product);
		
	}

	private static void find() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		 ProductDao productDao=(ProductDao)ctx.getBean("productdao");
		 Product product=productDao.find(1);
		 System.out.println("product found "+product);
	}

	private static void delete() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		 ProductDao productDao=(ProductDao)ctx.getBean("productdao");
		 Product product=new Product();
		 product.setId(1);
//		 product.setName("Computer");
//		 product.setDescription(" desktop Computer");
//		 product.setPrice(52000);
		 productDao.delete(product);
		 System.out.println("product deleted");
		
	}

	private static void update() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		 ProductDao productDao=(ProductDao)ctx.getBean("productdao");
		 Product product=new Product();
		 product.setId(1);
		 product.setName("Computer");
		 product.setDescription(" desktop Computer");
		 product.setPrice(52000);
		 productDao.update(product);
		 System.out.println("product update ");
		
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		 ProductDao productDao=(ProductDao)ctx.getBean("productdao");
		 Product product=new Product();
		 product.setId(1);
		 product.setName("Computer");
		 product.setDescription("Desktop");
		 product.setPrice(50000);
		 int result=productDao.create(product);
		 System.out.println("product created "+result);
	}
}
