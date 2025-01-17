package com.subh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subh.dao.IOrderRepo;
import com.subh.entity.Order;

@Service
public  class IOrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderRepo orderRepo;

	@Override
	public String createOrder(Order order) {
		//save the order in db
		Order ord = orderRepo.save(order);
		return "Order is created successfully with Order ID :" + ord.getOrderId();
	}

	@Override
	public Order fetchOrderById(Integer Id) {
		//fetch the order from repo
	Optional<Order> opt =	orderRepo.findById(Id);
		
	if(opt.isPresent()) {
		return opt.get();
		}
		else 
			throw new IllegalArgumentException("Invalid Order Id");
	}
	
}
