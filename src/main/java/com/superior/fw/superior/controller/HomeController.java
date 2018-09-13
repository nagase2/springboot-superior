package com.superior.fw.superior.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {

	@GetMapping
	public String greeting(@RequestParam(required = false, defaultValue = "") String name) {
		log.info("----------------------");
		System.out.println("this is greeting");
		return name.equals("") ? "Hey!" : "Hey, " + name + "!";
	}
}
