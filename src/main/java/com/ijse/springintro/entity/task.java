package com.ijse.springintro.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class task {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;

    private Integer priority;

    private LocalDateTime dueDate;

    // //setter
    // public void setTaskName(String taskName){
    //     this.taskName = taskName;
    // }

    // //getter
    // public String getTaskName(){
    //     return this.taskName;
    // }
}
