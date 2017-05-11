package com.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.model.User;
import com.book.service.UserService;

@Controller
public class HollerWorld {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/helloworld")
	public String helloworld(){
		return "success";
	}
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request){
		List<User> resutlList = userService.select();
		
		
		if (resutlList != null && resutlList.size() > 0) {
			for (User user : resutlList) {
				System.out.println(user.getUserName());
			}
		}
		request.setAttribute("userList", resutlList);
		return "allUser";
	}
}
