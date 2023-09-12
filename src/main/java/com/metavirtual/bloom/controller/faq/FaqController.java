package com.metavirtual.bloom.controller.faq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faq")
public class FaqController {

    @GetMapping("/faqMain")
    public String faqMain() {
        return "faq/faqMain";
    }
}
