package com.taskmaster.taskmaster_backend.task;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    
    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List getAllTasks() {
        return repo.findAll();
    }

    public Task geTasktById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Task createTask(Task task) {
        return repo.save(task);
    }

    public Task updateTask(String id, Task task) {
        Task existingTask = repo.findById(id).orElse(null);
        if (existingTask != null) {
            existingTask.setTitle(task.getTitle());
            existingTask.setDescription(task.getDescription());
            existingTask.setStatus(task.getStatus());
            return repo.save(existingTask);
        }
        return null;
    }

    public void deleteTask(String id) {
        repo.deleteById(id);
    }

}
