package com.example.projetoredes.controller;

import com.example.projetoredes.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/dividir")
    public double dividir(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.dividir(a, b);
    }
}
