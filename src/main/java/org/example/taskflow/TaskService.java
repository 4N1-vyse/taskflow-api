package org.example.taskflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

    @Autowired
    private TaskRepository taskRepository;


    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }


    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
}