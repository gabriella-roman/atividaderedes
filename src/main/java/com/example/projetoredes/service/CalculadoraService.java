package com.example.projetoredes.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
  public double dividir(double a, double b) {
    if (b == 0) {
      throw new IllegalArgumentException("Divisor não pode ser zero");
    }
    return a / b;
  }
}
