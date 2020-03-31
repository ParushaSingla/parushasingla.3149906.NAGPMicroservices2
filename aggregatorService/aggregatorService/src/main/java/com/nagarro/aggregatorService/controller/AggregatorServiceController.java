package com.nagarro.aggregatorService.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nagarro.aggregatorService.model.AggregatedResult;
import com.nagarro.aggregatorService.model.OrderList;
import com.nagarro.aggregatorService.model.User;

@RestController
@Component
@ComponentScan("com.nagarro.userService")
public class AggregatorServiceController {
	
	@Value("${service.order.url}")
	String orderUrl;
	
	@Value("${service.user.url}")
	String userUrl;

	@GetMapping("orderDetails/{id}")
	public AggregatedResult userDetails(@PathVariable("id") int id) {
		ResponseEntity<User> userDetails = new RestTemplate().getForEntity(userUrl+"/user/{id}",
				User.class, id);
		ResponseEntity<OrderList> ordersOfUser = new RestTemplate().getForEntity(orderUrl+"/orders/{id}",
				OrderList.class, id);

		User user = userDetails.getBody();
		OrderList ListOfOrder = ordersOfUser.getBody();

		AggregatedResult result = new AggregatedResult();
		result.setUser(user);
		result.setOrder(ListOfOrder.getOrder());
		return result;

	}
}
