package com.example.demo.repositories
import TodoItem
import org.springframework.data.mongodb.repository.MongoRepository

interface TodoRepository:MongoRepository<TodoItem,String> {
}