package com.brjnptr.todo.service;

import com.brjnptr.todo.entity.TaskEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {
    public List<TaskEntity> getAllTask();

    TaskEntity saveTask(TaskEntity task);
    TaskEntity getTaskById(Long id);
    TaskEntity updateTask(TaskEntity task);
    void deleteTaskById(Long id);
}
