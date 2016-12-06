package com.livelazily.spring.learning

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by livelazily
 */
@Controller
class RootController {
    @RequestMapping("/")
    fun index(model: Model): String {
        model.addAttribute("title", "Spring boot title")
        return "index"
    }
}
