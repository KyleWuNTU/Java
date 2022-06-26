package com.example.spring_boot_test.Controller;

import com.example.spring_boot_test.Service.ProjectService;
import com.example.spring_boot_test.Model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Member") // assign url
public class MemberController {
  @Autowired
  ProjectService service;

  @GetMapping(value = { "/test1", "/test2" }) // 可以利用 test1 / test2 兩個 value 進入
  public ResponseEntity getMembers() { // ResponseEntity可以作為 controller 的返回值
    Iterable<Member> memberList = service.getMember(); // 建立一個 iterable 物件 memberList
    return ResponseEntity.status(HttpStatus.OK).body(memberList); // 以 json 格式回傳 memberList
  }

  @GetMapping(value = { "/test3", "/test4" }) // 可以利用 test3 / test4 兩個 value 進入
  public ResponseEntity presentMembers() { // ResponseEntity可以作為 controller 的返回值
    Iterable<Member> memberList = service.getMember();
    return ResponseEntity.status(HttpStatus.OK).body(memberList);
  }
}
