package org.redmondchristian.teams

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class Application {
    @Bean
    open fun kotlinFunction(): (String) -> String {
        return { it.toUpperCase() }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}