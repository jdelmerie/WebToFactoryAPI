package com.webfactory.todo.service;

import com.webfactory.todo.entities.Todo;

import java.util.List;

public interface ServiceBusiness {
    public List<Todo> getAll();

    public Todo save(Todo todo);

    public Todo getById(Long todoId);

}
