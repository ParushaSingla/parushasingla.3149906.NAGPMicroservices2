package com.nagarro.orderService.model;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class OrderList {

	public OrderList(List<Order> order) {
		super();
		this.order = order;
	}

	public OrderList() {

	}

	@Override
	public String toString() {
		return "OrderList [order=" + order + "]";
	}

	List<Order> order;

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

}
