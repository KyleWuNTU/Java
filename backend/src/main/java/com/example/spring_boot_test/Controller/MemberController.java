package com.example.spring_boot_test.Controller;

import com.example.spring_boot_test.Service.ProjectService;
import com.example.spring_boot_test.Model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Member")
public class MemberController {
  @Autowired
  ProjectService service;

  @GetMapping(value = { "/test1", "/test2" })
  public ResponseEntity getMembers() { // ResponseEntity可以作為 controller 的返回值
    Iterable<Member> memberList = service.getMember();
    return ResponseEntity.status(HttpStatus.OK).body(memberList);
  }

  @GetMapping(value = { "/test3", "/test4" })
  public ResponseEntity presentMembers() { // ResponseEntity可以作為 controller 的返回值
    Iterable<Member> memberList = service.getMember();
    return ResponseEntity.status(HttpStatus.OK).body(memberList);
  }
}
