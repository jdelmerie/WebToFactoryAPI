package com.webfactory.todo.controller;

import com.webfactory.todo.entities.Todo;
import com.webfactory.todo.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private TodoServiceImpl todoService;

    @GetMapping("/todos")
    public List<Todo> listOfTrainings() {
        return todoService.getAll();
    }
}