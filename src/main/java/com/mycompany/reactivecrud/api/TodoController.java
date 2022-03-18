package com.mycompany.reactivecrud.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.reactivecrud.dao.TodoRepository;
import com.mycompany.reactivecrud.model.Todo;
import com.mycompany.reactivecrud.model.TopicEnum;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
	
	private final TodoRepository repository;
	
	public TodoController(TodoRepository repository) {

		this.repository = repository;
	}

	@GetMapping
	Flux<Todo> getAll() {

		return repository.findAll();
	}

	@PostMapping
	Mono<Todo> addTodo(@RequestBody Todo todo) {

		return repository.save(todo);
	}

	@PutMapping
	Mono<Todo> updateTodo(@RequestBody Todo todo) {

		return repository.save(todo);
	}

	@DeleteMapping("/{id}")
	Mono<Void> deleteById(@PathVariable("id") Long id) {

		return repository.deleteById(id);
	}
	
	@GetMapping("/completed/{topic}")
	Flux<Todo> findCompletedByTopic(@PathVariable("topic") TopicEnum topic) {

		return repository.findCompletedByTopic(topic);
	}
	
}
