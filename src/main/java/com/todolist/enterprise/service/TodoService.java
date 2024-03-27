package com.todolist.enterprise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.todolist.enterprise.dao.TaskRepository;
import com.todolist.enterprise.dto.Task;

@Component
public class TodoService implements ITodoService {
    private final TaskRepository taskRepository;

    @Autowired
    public TodoService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task getTaskById(int taskId) {
        return taskRepository.findById(taskId).get();
    }
    
}
