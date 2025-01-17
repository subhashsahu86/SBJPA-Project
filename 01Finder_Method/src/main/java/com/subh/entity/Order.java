package com.subh.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="ORDER_INFO")
public class Order {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name="ORDER_ID")
	private Integer orderId;
    
    @Column(name="QUANTITY")
    private Integer quantity;
    
    @Column(name="PRICE")
    private Double price;
    
    @Column(name="ORD_DATE")
    private Date orderDate;
    
    @Column(name="DISCOUNT")
    private Double discount;
    
    @Column(name="ORD_STATUS")
    private String orderStatus;
    
}
