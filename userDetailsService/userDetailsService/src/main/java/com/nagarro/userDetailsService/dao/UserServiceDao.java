package com.nagarro.userDetailsService.dao;

import org.springframework.stereotype.Service;

import com.nagarro.userDetailsService.model.User;

@Service
public interface UserServiceDao {
       public User getUserDetails(int id);
}
