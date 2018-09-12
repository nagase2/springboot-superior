package com.superior.fw.superior.repository;

import com.superior.fw.superior.entity.Chapter;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String>{
  
}