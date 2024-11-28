package com.example.projetoredes.service;

public class CalculadoraService {
  public double dividir(double a, double b) {
    if (b == 0) {
      throw new IllegalArgumentException("Divisor não pode ser zero");
    }
    return a / b;
  }
}
