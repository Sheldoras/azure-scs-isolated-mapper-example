package com.example.demo

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Consumer

@Configuration
class ConsumerConfig {

    @Bean
    fun data() = Consumer<Any> { msg ->
        println(msg)
    }

    @Bean
    fun myObjectMapper() = ObjectMapper()
}