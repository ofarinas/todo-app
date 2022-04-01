package com.example.todoapi.controllers

import com.example.todoapi.models.TodoItem
import com.example.todoapi.repositories.TodoRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
class TodoController(private val todoRepository: TodoRepository) {

    @GetMapping("/")
    fun geTodo(): ResponseEntity<List<TodoItem>> {
        return ResponseEntity.ok(todoRepository.findAll());
    }

    @GetMapping("/id")
    fun geTodo(@PathVariable id:String): ResponseEntity<TodoItem> {
        return ResponseEntity.ok(todoRepository.findById(id).orElse(null))
    }
    @PostMapping("")


}