package com.todolist.enterprise;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.todolist.enterprise.dto.Task;
import com.todolist.enterprise.service.ITodoService;


@Controller
public class TaskController {

    @Autowired
    private ITodoService todoService;

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/task/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable("id") int id) {
        try {
            Task foundTask = todoService.getTaskById(id);
            return new ResponseEntity<Task>(foundTask, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
