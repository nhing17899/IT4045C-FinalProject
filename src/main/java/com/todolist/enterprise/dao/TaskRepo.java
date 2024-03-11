package com.todolist.enterprise.dao;

import org.springframework.stereotype.Repository;
import com.todolist.enterprise.dto.Task;

@Repository
public class TaskRepositoryImpl implements TaskDAO {
    @Override
    public Task getTaskById(int taskId) {
        return null;
    }
}
