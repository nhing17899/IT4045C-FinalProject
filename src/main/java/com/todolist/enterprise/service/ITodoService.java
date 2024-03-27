package com.todolist.enterprise.service;

import com.todolist.enterprise.dto.Task;

public interface ITodoService {
    /**
     * Fetch a todo task with a given ID.
     * @param taskId a unique identifier for a recipe
     * @return the matching task, or null if no matches found
     */
    public Task getTaskById(int taskId);    
}