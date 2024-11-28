package test.java.com.example.projetoredes.service;

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
