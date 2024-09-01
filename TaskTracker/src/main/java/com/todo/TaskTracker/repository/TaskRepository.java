package com.todo.TaskTracker.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.TaskTracker.model.Task;


public interface TaskRepository extends JpaRepository<Task,Long> {

}
