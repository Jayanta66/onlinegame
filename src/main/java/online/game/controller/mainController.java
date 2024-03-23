package online.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import online.game.serviceImpl.UserServiceImpl;

@Controller
public class mainController {
	
//	@Autowired
//	UserServiceImpl userServiceImpl;
//	
	@GetMapping("/")
	public String homepage() {
		return "index";
	}
}
