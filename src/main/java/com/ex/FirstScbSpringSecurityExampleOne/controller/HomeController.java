package com.ex.FirstScbSpringSecurityExampleOne.controller;
/*
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * @Controller public class HomeController {
 * 
 * @RequestMapping("/home") public String getHomeView() { return "home"; }
 * 
 * @RequestMapping("/login") public String getLoginView() { return "login"; }
 * 
 * @RequestMapping("/public/resource") public String getPublicView() { return
 * "public"; } }
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/home")
	public String getHomeView() {
		return "home";
	}

	@RequestMapping("/login")
	public String getLoginView() {
		return "login";
	}

	@RequestMapping("/public/resource")
	public String getPublicView() {
		return "public";
	}
}
