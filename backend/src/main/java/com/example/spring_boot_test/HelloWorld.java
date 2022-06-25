package com.example.spring_boot_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
  @RequestMapping("/") // 這會讓網頁主頁顯示以下 function
  public String sayHello() {
    return "Hello Mummy";
  }
}