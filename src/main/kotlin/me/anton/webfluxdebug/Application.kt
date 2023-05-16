package me.anton.webfluxdebug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebfluxDebugApplication

fun main(args: Array<String>) {
    runApplication<WebfluxDebugApplication>(*args)
}
