package com.company.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

  @Value("${my.service-url}")
  private String myServiceUrl;

  @Autowired
  private RestTemplate restTemplate;

  public String test(String name) {
    ResponseEntity entity = restTemplate
        .postForEntity(myServiceUrl + "provider/test/" + name, null, String.class);
    return entity.getBody().toString();

  }
}
