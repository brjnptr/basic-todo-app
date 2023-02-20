package com.brjnptr.todo.service;

import com.brjnptr.todo.entity.TaskEntity;
import com.brjnptr.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TodoServiceImp implements TodoService{

    private TodoRepository repository;

    public TodoServiceImp(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TaskEntity> getAllTask() {
        return repository.findAll();
    }
}
