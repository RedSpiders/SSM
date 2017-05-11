package com.book.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.mapper.UserMapper;
import com.book.model.User;
import com.book.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	public List<User> select() {
		List<User> resultList = userMapper.findAll();
		return resultList;
	}

	
}
