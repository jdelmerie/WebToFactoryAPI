package com.webfactory.todo.controller;

import com.webfactory.todo.entities.Todo;
import com.webfactory.todo.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/updateTodoState/{todoId}")
    public Todo updateTraining(@PathVariable("todoId") Long todoId, @RequestBody Todo todo) {
        todo.setDone(!todo.isDone());
        todoService.save(todo);
        return todo;
    }

    @PostMapping("/addNewTodo/")
    public Todo addNewTodo(@RequestBody Todo todo) {
        todoService.save(todo);
        return todo;
    }

}
