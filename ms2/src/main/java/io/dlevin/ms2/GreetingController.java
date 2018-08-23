package io.dlevin.ms2;

import org.springframework.beans.factory.annotation.Autowired;
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

  private final Ms1Client ms1Client;

  @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
  @Autowired
  public GreetingController(Ms1Client ms1Client) {
    this.ms1Client = ms1Client;
  }

  @GetMapping
  public String greet() {
    return "Greetings from [" + applicationName + "] running on port [" + applicationPort + "]\n" + ms1Client.greeting();
  }

}
