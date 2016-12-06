package com.livelazily.spring.learning

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.model
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.view

/**
 * Created by livelazily
 */
@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(Application::class))
@AutoConfigureMockMvc
class RootControllerTest {
    @Autowired
    private var mvc: MockMvc? = null

    @Test
    @Throws(Exception::class)
    fun getHello() {
        mvc!!.perform(MockMvcRequestBuilders.get("/"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(view().name("index"))
            .andExpect(model().attribute("title", "Spring boot title"))
    }
}
