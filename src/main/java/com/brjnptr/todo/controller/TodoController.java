package com.brjnptr.todo.controller;

import com.brjnptr.todo.entity.TaskEntity;
import com.brjnptr.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }
    //handler method, list of tasks and return mode and view
    //tasks is a view, we can add the details in the template folder
    @GetMapping("/tasks")
    public String listTasks(Model model){
        model.addAttribute("tasks", todoService.getAllTask());
        return "tasks";
    }
    @GetMapping("/tasks/new")
    public String createTaskForm(Model model){
        TaskEntity task = new TaskEntity();
        model.addAttribute("task", task);
        return "create_task";
    }
    @PostMapping("/tasks")
    public String saveTask(@ModelAttribute("task") TaskEntity task){
        todoService.saveTask(task);
        return "redirect:/tasks";
    }
}
