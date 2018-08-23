package io.dlevin.ms1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

  @Value("${spring.application.name}")
  private String applicationName;

  @Value("${server.port}")
  private String applicationPort;

  @GetMapping
  public String greet() {
    return "Greetings from [" + applicationName + "] running on port [" + applicationPort + "]";
  }

}
