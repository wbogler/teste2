package com.todo.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.entities.ToDoEntity;

public interface ToDoRepository extends JpaRepository<ToDoEntity, Long> {

}
