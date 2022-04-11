package com.example.demo.controllers

import TodoItem
import com.example.demo.repositories.TodoRepository
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
    fun getTodo(@PathVariable id:String): ResponseEntity<TodoItem> {
        return ResponseEntity.ok(todoRepository.findById(id).orElse(null))
    }
    @PostMapping("/")
    fun postTodo(@RequestBody todoItem: TodoItem): ResponseEntity<TodoItem> {
        return ResponseEntity.ok( todoRepository.save(todoItem))
    }
    @DeleteMapping("/id")
    fun postTodo(@PathVariable id:String): ResponseEntity<Unit> {
        return ResponseEntity.ok(todoRepository.deleteById(id))
    }

}