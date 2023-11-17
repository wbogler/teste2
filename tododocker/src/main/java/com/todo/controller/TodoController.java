package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.entities.ToDoEntity;
import com.todo.services.ToDoService;

@RestController
@RequestMapping
public class TodoController {
	
	@Autowired
	private ToDoService service;
	
	@GetMapping
	public String todo() {
		return "<h1>Passou</h1> <h2>Teste2</h2>";
	}
	
	@GetMapping("/listall")
	public String listarTodos() {
		var lembretes = service.listAll();
		String toShow = "";
		for (ToDoEntity x:lembretes) {
			toShow +=
					"<p>"+x.getLembrete()+"</p> <br>";
		}
		return toShow;
	}
	
	@PostMapping("/log")
	public String testeRotaLivre(@RequestBody String teste) {
		System.out.println(teste);
		return "<h1> Rota livre </h1>";
	}

}
