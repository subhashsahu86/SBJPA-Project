package com.subh.dao;

import org.springframework.data.repository.CrudRepository;

import com.subh.entity.Order;

public interface IOrderRepo extends CrudRepository<Order,Integer> {
         
}