package com.nagarro.orderService.model;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonIgnore;

@EntityScan
public class Order {
	int orderId;
	@JsonIgnore
	int user_id;
	int orderAmount;
	String orderDate;

	public Order() {
	}

	public Order(int orderId, int user_id, int orderAmount, String orderDate) {
		super();
		this.orderId = orderId;
		this.user_id = user_id;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", user_id=" + user_id + ", order_amount=" + orderAmount
				+ ", orderDate=" + orderDate + "]";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	
}
