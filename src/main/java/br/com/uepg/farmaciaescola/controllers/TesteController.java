package br.com.uepg.farmaciaescola.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class TesteController {

    @GetMapping
    public String get() {
        return "index";
    }
}
