package com.cyb.security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "home";
	}

	@RequestMapping("home")
	public String home() {
		return "home";
	}

	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("login")
	public String login() {
		return "login";
	}
}
