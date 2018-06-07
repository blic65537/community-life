package com.community.life;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@RequestMapping(value="/lol.do")
	public String lolBoard() {
		return "lolBoard";
	}
	
	@RequestMapping(value="/test")
	public String testBoard() {
		return "testBoard";
	}
}
