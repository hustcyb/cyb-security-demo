package com.cyb.security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@RequestMapping("/")
	public String index() {
		return "home";
	}

	@RequestMapping("/password")
	public @ResponseBody String password() {
		String rawPassword = "123";
		return passwordEncoder.encode(rawPassword);
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
