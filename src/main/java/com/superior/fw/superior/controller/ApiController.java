package com.superior.fw.superior.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.superior.fw.superior.entity.Image;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class ApiController {
	private static final String API_BASE_PATH = "/api";
	
	@GetMapping(API_BASE_PATH+"/images")
	Flux<Image> images(){
		return Flux.just(
				new Image("1", "lerning-spring-boot-cover.jpg"),
				new Image("2", "learnin-2nd-edition-cover.jpg"),
				new Image("3", "bazinga.png")
				);
	}
	

	@PostMapping(API_BASE_PATH + "/images")
	Mono<Void> create(@RequestBody Flux<Image> images) {
		return images
			.map(image -> {
				log.info("We will save " + image +
					" to a Reactive database soon!");
				return image;
			})
			.then();
	}
}
