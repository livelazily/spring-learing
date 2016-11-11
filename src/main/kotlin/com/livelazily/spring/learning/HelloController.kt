package com.livelazily.spring.learning

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by livelazily
 */
@RestController
class HelloController {
    @RequestMapping("/")
    fun index(): String {
        return "Greetings from Spring Boot!"
    }
}
