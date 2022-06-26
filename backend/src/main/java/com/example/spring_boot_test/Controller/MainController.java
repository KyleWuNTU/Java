package com.example.spring_boot_test.Controller;

import com.example.spring_boot_test.Service.ProjectService;
import com.example.spring_boot_test.Model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody // ResponseBody is just when you want to return a JSON object not a view.
public class MainController {
  @GetMapping("/")
  public String sayHello() {
    return "Hello World";
  }
}
