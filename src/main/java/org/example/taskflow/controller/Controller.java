package org.example.taskflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class Controller {

    @GetMapping
    public String getTasks() {
        return "Hey, my TaskFlow API is actually working!";
    }
}