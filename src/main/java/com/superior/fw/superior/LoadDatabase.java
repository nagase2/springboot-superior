package com.superior.fw.superior;

import com.superior.fw.superior.entity.Chapter;
import com.superior.fw.superior.repository.ChapterRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {
  @Bean
  CommandLineRunner init(ChapterRepository repository) {
    return args ->{
      Flux.just(
        new Chapter("quick"),
        new Chapter("start"),
        new Chapter("java"))
        .flatMap(repository::save)
        .subscribe(System.out::println);  
    };
  }
}
