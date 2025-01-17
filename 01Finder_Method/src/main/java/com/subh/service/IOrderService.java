package com.subh.service;


import com.subh.entity.Order;


public interface IOrderService {
  
	public String createOrder(Order order);
	public Order fetchOrderById(Integer Id);
}
    