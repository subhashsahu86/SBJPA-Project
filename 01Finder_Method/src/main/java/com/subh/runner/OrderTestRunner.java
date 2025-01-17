package com.subh.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subh.entity.Order;
import com.subh.service.IOrderServiceImpl;

@Component
public class OrderTestRunner implements CommandLineRunner {

	@Autowired
	private IOrderServiceImpl orderService;
	
	@Override
	public void run(String... args) throws Exception {
         		
		//create the order
		Order order = new Order();
		order.setQuantity(10);
		order.setDiscount(20.00);
		order.setPrice(10000.00);
		
		Date now = new Date();
		order.setOrderDate(now);
		
		order.setOrderStatus("Success");
		
		//call the orderservice
		
		String msg = orderService.createOrder(order);
		
		System.out.println(msg);
	
		try {
			System.out.println("Hello");
			System.out.println(orderService.fetchOrderById(152));
		}catch (Exception e) {
		e.printStackTrace();
		}
		
	}

	
}
