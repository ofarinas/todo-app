package com.example.todoappapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoAppApiApplication

fun main(args: Array<String>) {
	runApplication<TodoAppApiApplication>(*args)
}
