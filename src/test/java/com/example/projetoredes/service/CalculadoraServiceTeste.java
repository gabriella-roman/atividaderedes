package test.java.com.example.projetoredes.service;

import com.example.projetoredes.service.CalculadoraService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraServiceTeste {
  @Test
  @DisplayName("Quando acionado com 10 e 2, então deve retornar 5")
  public void testDividir() {
    CalculadoraService calculadoraService = new CalculadoraService();
    double a = 10;
    double b = 2;
    double esperado = 5;

    double resultado = calculadoraService.dividir(a, b);

    assertEquals(esperado, resultado);
  }
}
