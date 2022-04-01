package com.example.todoapi.repositories

import com.example.todoapi.models.TodoItem
import org.springframework.data.mongodb.repository.MongoRepository

public interface TodoRepository:MongoRepository<TodoItem,String> {
}