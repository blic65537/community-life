package com.community.life;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/login.page")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/regist.page")
	public String regist() {
		return "regist";
	}
}
