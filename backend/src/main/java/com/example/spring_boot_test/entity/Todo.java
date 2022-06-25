package com.example.spring_boot_test.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//定義entity 映射的資料庫欄位有id, task, status, createTime, updateTime

@Entity
@Table
@Data
@Getter
@Setter

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String task;

    @Column
    Integer status;

    @Column
    String createTime;

    @Column
    String updateTime;
}