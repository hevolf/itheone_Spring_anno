package com.evolf.cap09_Autowired.controller;

import org.springframework.stereotype.Controller;

import com.evolf.cap09_Autowired.service.TestService;

@Controller
public class TestController {
	//@Autowired
	private TestService testService;
}
