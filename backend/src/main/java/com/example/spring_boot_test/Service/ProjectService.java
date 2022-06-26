package com.example.spring_boot_test.Service;

import com.example.spring_boot_test.Dao.ProjectDao;
import com.example.spring_boot_test.Model.Member;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ProjectService {
  @Autowired
  ProjectDao dao;

  public Iterable<Member> getMember() {
    return dao.findAll();
  }
}
