package com.example.spring_boot_test.controller;

import com.example.spring_boot_test.entity.Todo;
import com.example.spring_boot_test.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

  @Autowired
  TodoService todoService;

  @GetMapping("/todos")
  public String getTodos(Model model) {
    Iterable<Todo> todoList = todoService.getTodos();
    model.addAttribute("todolist", todoList);
    Todo todo = new Todo(); // 新增一個 Todo 物件（包含多個欄位作為屬性）
    model.addAttribute("todoObject", todo); // 放一個什麼樣的物件
    return "todolist"; // 跳轉到 todolist
  }

  @PostMapping("/todos")
  public String createTodo(@ModelAttribute Todo todo, Model model) {
    Iterable<Todo> allTodoList = todoService.createTodo(todo);
    Todo emptyTodo = new Todo();
    model.addAttribute("todolist", allTodoList);
    model.addAttribute("todoObject", emptyTodo);
    return "redirect:/todos";
  }

  @ResponseBody
  @PutMapping("/todos/{id}")
  public void upadteTodo(@PathVariable Integer id, @RequestBody Todo todo) {
    todoService.updateTodo(id, todo);
  }

  @ResponseBody
  @DeleteMapping("/todos/{id}")
  public void deleteTodo(@PathVariable Integer id) {
    todoService.deleteTodo(id);
  }
}