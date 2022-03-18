package com.mycompany.reactivecrud.model;

import org.springframework.data.annotation.Id;

public class Todo {

	@Id
    private Long id;
    private String text;
    private TopicEnum topic;
    private boolean completed;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}	
	public TopicEnum getTopic() {
		return topic;
	}
	public void setTopic(TopicEnum topic) {
		this.topic = topic;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
    
}
