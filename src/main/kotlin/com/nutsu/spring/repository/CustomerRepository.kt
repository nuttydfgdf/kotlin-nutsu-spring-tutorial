package com.nutsu.spring.repository

import com.nutsu.spring.entity.Customers
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customers, Long>