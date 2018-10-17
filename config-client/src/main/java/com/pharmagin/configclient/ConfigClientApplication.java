package com.pharmagin.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigClientApplication.class, args);
  }

  @Autowired
  private ConfigProperties configProperties;

  @Autowired
  private RabbitConfigProperties rabbitConfigProperties;

  @Value("${foo}")
  private String foo;

  @Value("${product.id}")
  private String productId;

  @RequestMapping(value = "/hi")
  public String hi(){
    return foo + "    " + productId;
  }

  @RequestMapping(value = "/yml")
  public ConfigProperties testYml(){
    return configProperties;
  }

  @RequestMapping(value = "/rabbit")
  public RabbitConfigProperties getRabbitConfiguration(){
    return rabbitConfigProperties;
  }
}
