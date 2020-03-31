package com.nagarro.aggregatorService.model;

import java.util.List;

public class AggregatedResult {
     User user;
     List<Order> order;
 	public AggregatedResult() {

	}
	@Override
	public String toString() {
		return "AggregatedResult [user=" + user + ", order=" + order + "]";
	}
	public AggregatedResult(User user, List<Order> order) {
		super();
		this.user = user;
		this.order = order;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
}
