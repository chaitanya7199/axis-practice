package com.practice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudClientApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudClientApplication>(*args)
}
