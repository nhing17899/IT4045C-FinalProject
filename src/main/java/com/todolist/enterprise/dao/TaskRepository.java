package com.todolist.enterprise.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

import com.todolist.enterprise.dto.Task;

@Profile("!test")
public interface TaskRepository extends CrudRepository<Task, Integer>{
    
}
