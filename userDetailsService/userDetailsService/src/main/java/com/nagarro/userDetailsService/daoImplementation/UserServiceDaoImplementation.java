package com.nagarro.userDetailsService.daoImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.userDetailsService.dao.UserServiceDao;
import com.nagarro.userDetailsService.model.User;

@Service
public class UserServiceDaoImplementation implements UserServiceDao {
	List<User> users = new ArrayList<User>();

	@Override
	public User getUserDetails(int id) {
		// TODO Auto-generated method stub
		usersDetils();
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public List<User> usersDetils() {
		User u1 = new User(1, "John", 23, "john.doe@google.com");
		User u2 = new User(2, "Rohan", 21, "Rohan.doe@google.com");
		User u3 = new User(3, "Raj", 20, "Raj.doe@google.com");
		users.add(u1);
		users.add(u2);
		users.add(u3);
		return users;
	}

}
