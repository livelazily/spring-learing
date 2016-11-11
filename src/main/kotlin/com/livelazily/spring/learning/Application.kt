package com.livelazily.spring.learning

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.util.*

/**
 * Created by livelazily
 */
@SpringBootApplication
open class Application {
    // https://kotlinlang.org/docs/tutorials/spring-boot-restful.html#creating-the-application-class
    companion object {

        private val logger = LoggerFactory.getLogger(Application::class.java)

        @JvmStatic fun main(args: Array<String>) {
            val ctx = SpringApplication.run(Application::class.java, *args)

            logger.info("Let's inspect the beans provided by Spring Boot:")

            val beanNames = ctx.beanDefinitionNames
            Arrays.sort(beanNames)
            for (beanName in beanNames) {
                logger.info(beanName)
            }
        }
    }
}
