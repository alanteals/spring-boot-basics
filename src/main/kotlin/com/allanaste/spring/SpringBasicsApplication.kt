package com.allanaste.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBasicsApplication

fun main(args: Array<String>) {
    runApplication<SpringBasicsApplication>(*args)
}
