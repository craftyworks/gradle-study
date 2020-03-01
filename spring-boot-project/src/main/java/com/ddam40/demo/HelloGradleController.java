package com.ddam40.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloGradleController {

  @GetMapping
  public String helloGradle() {
    return "Hello Gradle!";
  }
}
