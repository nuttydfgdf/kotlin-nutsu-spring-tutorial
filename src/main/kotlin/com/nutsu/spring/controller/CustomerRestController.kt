package com.nutsu.spring.controller

import com.nutsu.spring.repository.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerRestController(val customerRepository: CustomerRepository) {

    @GetMapping
    fun getAll() = customerRepository.findAll()
}