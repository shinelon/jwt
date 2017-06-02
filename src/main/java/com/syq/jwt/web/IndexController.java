package com.syq.jwt.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "application is start up !";
	}
}
