package com.example.spring_boot_test.Model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
  @Id
  private String name;
  private String gender;
}
