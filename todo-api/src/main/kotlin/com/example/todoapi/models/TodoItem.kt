package com.example.todoapi.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class TodoItem {
    @Id
    var id = ""
    var name=""
    var value=""
}
