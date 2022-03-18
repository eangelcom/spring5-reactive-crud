package com.mycompany.reactivecrud.dao;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.mycompany.reactivecrud.model.Todo;
import com.mycompany.reactivecrud.model.TopicEnum;

import reactor.core.publisher.Flux;

public interface TodoRepository extends ReactiveCrudRepository<Todo, Long> {

	@Query("SELECT * FROM todo WHERE completed = true and topic = :topic")
    Flux<Todo> findCompletedByTopic(TopicEnum topic);
	
}
