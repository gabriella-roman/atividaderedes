package com.example.projetoredes.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoredes.service.CalculadoraService;

@RequestMapping("/usuarios")
@RestController

public class CalculadoraController {
    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/dividir/{a}/{b}")
    public double dividir(@PathVariable double a, @PathVariable double b) {
        return calculadoraService.dividir(a, b);
    }
}
