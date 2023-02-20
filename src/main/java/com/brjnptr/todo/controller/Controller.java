package com.brjnptr.todo.controller;

import com.brjnptr.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class Controller {
    private TodoService todoService;

    public Controller(TodoService todoService) {
        this.todoService = todoService;
    }
    //handler method, list of tasks and return mode and view
}
