package com.superior.fw.superior.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Document
@Slf4j
public class Chapter {
  @Id
  private String id;
  private String name;

  public Chapter(String name) {
    this.name = name;
  }
}
