package org.redmondchristian.teams

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class Application {
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}