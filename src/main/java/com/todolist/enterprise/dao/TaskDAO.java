package com.todolist.enterprise.dao;

import com.todolist.enterprise.dto.Task;

import java.util.List;

public interface TaskDAO {
    Task addTask(Task task);

    Task getTaskById(int taskId);
    List<Task> getAllTasks();

    Task updateTask(Task task);

    boolean deleteTask(int taskId);
}
