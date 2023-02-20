package com.brjnptr.todo.service;

import com.brjnptr.todo.entity.TaskEntity;
import com.brjnptr.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoServiceImp implements TodoService{

    private TodoRepository repository;

    public TodoServiceImp(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TaskEntity> getAllTask() {
        return repository.findAll();
    }

    @Override
    public TaskEntity saveTask(TaskEntity task) {
        return repository.save(task);
    }

    @Override
    public TaskEntity getTaskById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public TaskEntity updateTask(TaskEntity task) {
        return repository.save(task);
    }

    @Override
    public void deleteTaskById(Long id) {
        repository.deleteById(id);
    }
}
