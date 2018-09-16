package com.superior.fw.superior.repository;


import com.superior.fw.superior.entity.Image;

import reactor.core.publisher.Flux;

public interface MyRepository {
  Flux<Image> findAll();
  
}