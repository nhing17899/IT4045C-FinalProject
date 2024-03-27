package com.todolist.enterprise.service;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.todolist.enterprise.dto.Task;
import java.util.Date;

@Component
@Profile("test")
public class TodoServiceStub implements ITodoService {
    @Override
    public Task getTaskById(int taskId) {
        if (taskId == 1) {
            Task task = new Task();
            task.setName("Task 1");
            task.setDueDate(new Date());
            task.setCompleted(false);
            task.setListId(1);

            return task;
        }
        
        return null;
    }
}