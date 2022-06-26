package com.example.spring_boot_test.Dao;

import com.example.spring_boot_test.Model.Member;
import org.springframework.data.repository.CrudRepository;

public interface ProjectDao extends CrudRepository<Member, Integer> {
}
