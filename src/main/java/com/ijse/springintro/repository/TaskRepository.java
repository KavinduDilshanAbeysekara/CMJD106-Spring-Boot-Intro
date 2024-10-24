package com.ijse.springintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ijse.springintro.entity.Task;

@Repository //extend from task entitiy and it primary key is long
public interface TaskRepository extends JpaRepository<Task,Long>{ 
    //custom quaries can be defined here
}
