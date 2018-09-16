package com.superior.fw.superior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j

public class SuperiorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperiorApplication.class, args);
	}
}
