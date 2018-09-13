package com.superior.fw.superior.controller;

import com.superior.fw.superior.entity.Chapter;
import com.superior.fw.superior.repository.ChapterRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class ChapterController {
  private final ChapterRepository repository;

  public ChapterController(ChapterRepository repository) {
    this.repository = repository;
  }

  @RequestMapping("/chapters")
  public Flux<Chapter> listening() {
    return repository.findAll();
  }
}