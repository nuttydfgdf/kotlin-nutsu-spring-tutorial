package com.nutsu.spring.repository

import com.nutsu.spring.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Long>