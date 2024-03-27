package com.todolist.enterprise.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tasks")
public @Data class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Integer taskId;
    
    @Column(nullable = false)
    private String name;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(nullable = false)
    private boolean completed;

    @Column(name = "list_id")
    private Integer listId;

    @Column(name = "list_order")
    private Integer listOrder;

}
