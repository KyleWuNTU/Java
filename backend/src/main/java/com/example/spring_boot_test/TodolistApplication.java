package com.example.spring_boot_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootConfiguration - 繼承自 @Configuration, 標註當前類別是配置類, 並會將當前類別標記為@Bean的實例加入到spring 容器中 @SpringBootApplication是Spring Boot的核心註解，必須放在Application Class，而 main 方法，用於啟動 Spring Boot Application

//@EnableAutoConfiguration - 啟動自動加入配置, 導入你所需要的jar包, 例如本專案有用到 spring-boot-starter-web, 而這是spring的核心, 裡面包刮了webmvc, tomcat....等等, 它會自動加入
//@ComponentScan 掃描當前包與底下所有@Controller, @Service, @Compoment, @Repository項目

@SpringBootApplication
public class TodolistApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
