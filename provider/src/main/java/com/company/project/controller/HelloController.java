package com.company.project.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class HelloController {

  @RequestMapping("/test/{name}")
  public String test(@PathVariable String name) {
    return "helllo provider ::: " + name;
  }

}
