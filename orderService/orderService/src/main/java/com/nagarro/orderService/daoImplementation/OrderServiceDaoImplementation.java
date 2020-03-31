package com.nagarro.orderService.daoImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.orderService.dao.OrderServiceDao;
import com.nagarro.orderService.model.Order;

@Service
public class OrderServiceDaoImplementation implements OrderServiceDao {
	List<Order> orders = new ArrayList<Order>();
	int addOnlyOnce=1;

	@Override
	public List<Order> getAllOrders(int user_id) {
		// TODO Auto-generated method stub
		if(addOnlyOnce==1)
		setAllOrders();
		List<Order> ordersOfUser=new ArrayList<Order>();
		for (Order order : orders) {
			if (order.getUser_id() == user_id) {
				ordersOfUser.add(order);
			}
		}
		return ordersOfUser;
	}

	private void setAllOrders() {
		Order order1=new Order(1, 1, 250, "14-Apr-2020");
		Order order2=new Order(2, 1, 200, "15-Apr-2020");
		Order order3=new Order(3, 2, 350, "16-Apr-2020");
		Order order4=new Order(4, 2, 450, "19-Apr-2020");
		Order order5=new Order(5, 3, 750, "18-Apr-2020");
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		addOnlyOnce++;
	}

}
