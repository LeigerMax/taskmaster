package com.taskmaster.taskmaster_backend.task;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String status = "TODO"; // TODO, IN_PROGRESS, DONE
    private LocalDateTime createdAt = LocalDateTime.now();

    
}
