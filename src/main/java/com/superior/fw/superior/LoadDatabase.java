package com.superior.fw.superior;

import com.superior.fw.superior.entity.Chapter;
import com.superior.fw.superior.repository.ChapterRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Configuration
@Slf4j
public class LoadDatabase {
  @Bean
  CommandLineRunner init(ChapterRepository repository) {
    return args ->{
      Flux.just(
        new Chapter("quick...."),
        new Chapter("start start"),
        new Chapter("java!!!##"))
          .flatMap(repository::save)
        .subscribe(System.out::print);  
    };
  }
}
