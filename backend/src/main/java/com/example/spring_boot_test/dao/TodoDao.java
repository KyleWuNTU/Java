package com.example.spring_boot_test.dao;

import com.example.spring_boot_test.entity.Todo;
import org.springframework.data.repository.CrudRepository;

// 第一個參數為訪問的實體，第二參數是這個Entity ID的資料型態
public interface TodoDao extends CrudRepository<Todo, Integer> {

}

// 在這裡可以對從dao回傳的資料做處理，但這個範例是將取得的Iterable物件直接回傳，而CrudRepository文件
// 也提供許多操作資料庫的方法，如findById() 、save() 等。
