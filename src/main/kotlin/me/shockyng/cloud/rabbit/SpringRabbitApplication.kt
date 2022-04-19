package me.shockyng.cloud.rabbit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringRabbitApplication

fun main(args: Array<String>) {
	runApplication<SpringRabbitApplication>(*args)
}
