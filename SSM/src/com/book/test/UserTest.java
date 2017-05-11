package com.book.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.book.mapper.UserMapper;
import com.book.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/spring-common.xml")
public class UserTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void query(){
		List<User> resultList = userMapper.findAll();
		System.out.println(resultList.size());
		if (resultList != null && resultList.size() > 0) {
			for (User user : resultList) {
				System.out.println(user.getUserName());
			}
		}
		
	}
	
}
