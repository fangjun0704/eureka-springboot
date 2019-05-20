package com.company.project.controller;

import com.company.project.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

  @Autowired
  private ConsumerService consumerService;

  @RequestMapping("/test/{name}")
  public String test(@PathVariable String name) {
    return consumerService.test(name);
  }

}
