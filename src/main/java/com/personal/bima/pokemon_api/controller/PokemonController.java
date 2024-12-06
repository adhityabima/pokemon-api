package com.personal.bima.pokemon_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    
    @GetMapping("/path")
    public String getMethodName() {
        return "test";
    }
    
}
