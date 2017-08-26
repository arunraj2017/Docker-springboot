package com.tuto.docker.controller;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/sayhello", method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public HttpEntity<String> sayHelloFunc() {
		String body = "Hello World from Docker";
		return new HttpEntity<String>(body);
	}

}
