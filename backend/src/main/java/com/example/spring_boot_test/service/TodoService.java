package com.example.spring_boot_test.service;

import com.example.spring_boot_test.entity.Todo;
import com.example.spring_boot_test.dao.TodoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service // 在TodoService類別上方下 @Service 標註，可以將業務邏輯的程式碼撰寫在這裡，
public class TodoService {
    @Autowired // 標註@Autowired 可以讓Spring自動把屬性需要的對象從Spring容器找出来，並注入给該屬性，在這裡將TodoDao 注入在此。
    TodoDao todoDao; // 取得Dao物件

    public Iterable<Todo> getTodos() {
        return todoDao.findAll(); // 取回資料庫的所有資料，在這裡可以對從 dao 回傳的資料做處理，這個範例是把 iterable 物件直接回傳
    }

    public Iterable<Todo> createTodo(Todo todo) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        String date = df.format(new Date());
        todo.setCreateTime(date);
        todo.setUpdateTime(date);
        todoDao.save(todo);
        return getTodos();
    }

    public Todo updateTodo(Integer id, Todo todo) {
        try {
            Todo resTodo = findById(id);
            Integer status = todo.getStatus();
            resTodo.setStatus(status);
            return todoDao.save(resTodo);
        } catch (Exception exception) {
            return null;
        }

    }

    public Todo findById(Integer id) {
        Todo todo = todoDao.findById(id).get();
        return todo;
    }

    public Boolean deleteTodo(Integer id) {
        try {
            Todo resTodo = findById(id);
            todoDao.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

}

/*
 * 實作兩個方法分別是getTodo() 透過todoDao.findAll()去操作資料庫回傳所有資料、createTodo()
 * 也一樣透過todoDao.save()
 * 存放資料到資料庫，這次實作在service記錄存取建立時間，採用GMT標準時間，方便以後前端可以透過時區轉換時間，在不同時區顯示對應的時間。
 */