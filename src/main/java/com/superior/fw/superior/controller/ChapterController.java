package com.superior.fw.superior.controller;

import com.superior.fw.superior.entity.Chapter;
import com.superior.fw.superior.repository.ChapterRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@Slf4j
public class ChapterController {
  private final ChapterRepository repository;

  public ChapterController(ChapterRepository repository) {
    this.repository = repository;
  }

  @RequestMapping("/chapters")
  public Flux<Chapter> listening() {
	log.info("chapters has been called");
    return repository.findAll();
  }
}