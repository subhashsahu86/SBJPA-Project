package com.subh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subh.dao.IOrderRepo;
import com.subh.entity.Order;

@Service
public class IOrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderRepo orderRepo;
	
	
	@Override
	public String createOrder(Order order) {
		
		//save the order in DB
   Order ord     = orderRepo.save(order);
		
		return "Order is created successfully with Order ID :" + ord.getOrderId();
	}
	
	

}