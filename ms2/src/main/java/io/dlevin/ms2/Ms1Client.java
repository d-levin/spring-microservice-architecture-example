package io.dlevin.ms2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ms1")
public interface Ms1Client {

  @GetMapping("/greeting")
  String greeting();

}
