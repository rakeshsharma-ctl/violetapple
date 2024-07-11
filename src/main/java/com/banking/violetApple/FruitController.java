package com.banking.violetApple;

import jakarta.websocket.ClientEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @GetMapping("/{name}")
    public Fruit getFruit(@PathVariable String name) {
        return new Fruit(name, "Violet", "32.5");
    }
}

