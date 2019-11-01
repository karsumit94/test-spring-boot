package com.dhar.demowebapp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/abc")
	public String welcomeabc() {
		return "welcomeabc";
	}

}
