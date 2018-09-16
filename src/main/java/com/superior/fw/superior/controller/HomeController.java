package com.superior.fw.superior.controller;

import com.superior.fw.superior.service.ImageService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class HomeController {
	private static final String BASE_PATH = "/images";
	private static final String FILENAME = "{filename].}";

	private final ImageService imageService;

	public HomeController(ImageService imageService) {
		this.imageService = imageService;
	}

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
