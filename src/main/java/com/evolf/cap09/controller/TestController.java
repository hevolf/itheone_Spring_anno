package com.evolf.cap09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.evolf.cap09.service.TestService;

@Controller
public class TestController {
	//@Autowired
	private TestService testService;
}
