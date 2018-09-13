package com.superior.fw.superior.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {

	@RequestMapping
	public String greeting(@RequestParam(required = false, defaultValue = "", value = "/xx") String name) {
		log.info("----------------------");
		System.out.println("this is greeting...");
		return name.equals("") ? "Hey!!!!!" : "Hey, " + name + "!";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/xxx")
	public String greeting2() {
		log.info("----------------------");
		System.out.println("this is greeting...");
		return "fixed";
	}


}
