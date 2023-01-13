package com.webfactory.todo.service;

import com.webfactory.todo.dao.TodoRepository;
import com.webfactory.todo.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements  ServiceBusiness{

    @Autowired
    TodoRepository todoRepository;

    @Override
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo getById(Long todoId) {
        return todoRepository.getById(todoId);
    }
}
