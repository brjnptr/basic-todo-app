package com.brjnptr.todo.service;

import com.brjnptr.todo.entity.TaskEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {
    public List<TaskEntity> getAllTask();
}
