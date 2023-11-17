package br.com.uepg.farmaciaescola.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping("/materias-primas")
    public String materiasPrimas() {
        return "materias-primas/index";
    }
}
