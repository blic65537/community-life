package com.community.life;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping(value="/user/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/user/regist")
	public String regist() {
		return "regist";
	}
}
