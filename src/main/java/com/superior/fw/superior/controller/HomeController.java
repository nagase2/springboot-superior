package com.superior.fw.superior.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String greeting(@RequestParam(required = false, defaultValue = "") String name) {
		System.out.println("-----------------");
		System.out.println("this is greeting");
		return name.equals("") ? "Hey!" : "Hey, " + name + "!";
	}
}
