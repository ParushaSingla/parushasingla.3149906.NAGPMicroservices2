package com.nagarro.orderService.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.orderService.model.Order;

@Service
public interface OrderServiceDao {
       public List<Order> getAllOrders(int user_id);
}
