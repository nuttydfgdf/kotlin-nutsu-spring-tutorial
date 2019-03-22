package com.nutsu.spring.main

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan("com.nutsu.spring")
@EntityScan("com.nutsu.spring.entity")
@EnableJpaRepositories("com.nutsu.spring.repository")
class MyApiSpringbootApplication

fun main(args: Array<String>) {
	runApplication<MyApiSpringbootApplication>(*args)
}
