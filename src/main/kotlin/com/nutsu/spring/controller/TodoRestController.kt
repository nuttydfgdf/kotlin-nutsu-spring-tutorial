package com.nutsu.spring.controller

import com.nutsu.spring.entity.Todo
import com.nutsu.spring.repository.TodoRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/todos")
class TodoRestController(val todoRepository: TodoRepository) {

    @GetMapping
    fun getTodos() = todoRepository.findAll()

    @RequestMapping(path = [("/{todoId}")], method = [(RequestMethod.GET)])
    fun getTodo(@PathVariable("todoId") todoId: Long?): Optional<Todo>? {
        val temp: Long = todoId?.toLong() ?: -1
        return todoRepository.findById(temp)
    }

    @PostMapping
    fun newTodo(@RequestBody todo: Todo): Todo {
        todoRepository.save(todo)
        return todo
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun updateTodo(todo: Todo) {
        todoRepository.save(todo)
    }

    @RequestMapping(path = [("/{todoId}")], method = [(RequestMethod.DELETE)])
    fun deleteTodo(@PathVariable("todoId") todoId: Long?) {
        val temp: Long = todoId?.toLong() ?: -1
        todoRepository.deleteById(temp)
    }
}