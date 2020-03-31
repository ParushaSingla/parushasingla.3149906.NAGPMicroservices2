package com.nagarro.orderService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.orderService.dao.OrderServiceDao;
import com.nagarro.orderService.model.Order;
import com.nagarro.orderService.model.OrderList;

@RestController
@Component
@ComponentScan("com.nagarro.userService")
public class OrderController {

	@Autowired
	OrderServiceDao orderServiceDao;

	@GetMapping("orders/{id}")
	public OrderList userDetails(@PathVariable("id") int id) {
		OrderList list = new OrderList();
		List<Order> order = orderServiceDao.getAllOrders(id);
		if (order == null) {
			list.setOrder(order);
			return list;
		} else {
			list.setOrder(order);
			return list;
		}
	}
}
