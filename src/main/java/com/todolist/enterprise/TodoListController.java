package com.todolist.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.todolist.enterprise.dto.Task;
import com.todolist.enterprise.dto.TodoList;
import com.todolist.enterprise.service.ITodoService;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TodoListController {

    @Autowired
    private ITodoService todoService;

    @GetMapping("/{id}")
    public ResponseEntity<TodoList> getTodoListById(@PathVariable("id") int id) {
        try {
            TodoList foundTodoList = todoService.getTodoListById(id);
            return new ResponseEntity<TodoList>(foundTodoList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/")
    public String getTasksInTodoList(Model model) {
        List<TodoList> foundLists = todoService.getTodoLists();
        model.addAttribute("todoLists", foundLists);
        return "home";
    }

    @PostMapping("/")
    public String createTodoList(@RequestBody TodoList todoList, Model model) {
        TodoList newLists = todoService.createTodoList(todoList);
        List<TodoList> foundLists = todoService.getTodoLists();
        foundLists.add(newLists);
        model.addAttribute("todoLists", foundLists);
        return "home";
    }

    @RequestMapping("/saveTodoList")
    public String saveTodoList(TodoList todoList) {
        todoService.createTodoList(todoList);
        return "home";
    }

    @PutMapping("/")
    public ResponseEntity<TodoList> updateTodoList(@RequestBody TodoList todoList) {
        try {
            TodoList updatedTodoList = todoService.modifyTodoList(todoList);
            return new ResponseEntity<TodoList>(updatedTodoList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoList(@PathVariable("id") int id) {
        try {
            List<Task> tasksInListToDelete = todoService.getTasksInTodoList(id);

            tasksInListToDelete.forEach(task -> {
                todoService.deleteTask(task.getTaskId());
            });

            todoService.deleteTodoList(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
