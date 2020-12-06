package com.gerkir.rina

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RinaApplication

fun main(args: Array<String>) {
    runApplication<RinaApplication>(*args)
}
