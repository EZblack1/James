package com.br.ezblack.james.controller;

import com.br.ezblack.james.model.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerGreeting {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // ✅ Mapeamento do endpoint principal
    @GetMapping("/")
    public String home() {
        return "API online! Use /greeting";
    }

    // ✅ Mapeamento do endpoint de saudação
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
