package com.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.entities.ToDoEntity;
import com.todo.respositories.ToDoRepository;

@Service
public class ToDoService {
	
	@Autowired
	private ToDoRepository repository;
	
	public List<ToDoEntity> listAll(){
		return repository.findAll();
	}

}
