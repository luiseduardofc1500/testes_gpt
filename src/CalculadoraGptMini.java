import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraGptMini {



    private final Calculadora calculadora = new Calculadora();

    // Testes para soma
    @Test
    void testSomar() {
        assertEquals(5, calculadora.somar(2, 3));
        assertEquals(0, calculadora.somar(0, 0));
        assertEquals(-5, calculadora.somar(-2, -3));
    }

    // Testes para subtração
    @Test
    void testSubtrair() {
        assertEquals(-1, calculadora.subtrair(2, 3));
        assertEquals(2, calculadora.subtrair(2, 0));
        assertEquals(5, calculadora.subtrair(2, -3));
    }

    // Testes para multiplicação
    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(0, calculadora.multiplicar(2, 0));
        assertEquals(6, calculadora.multiplicar(-2, -3));
    }

    // Testes para divisão
    @Test
    void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(1, 0));
        assertEquals(-2, calculadora.dividir(-6, 3));
    }

    // Testes para raiz quadrada
    @Test
    void testRaizQuadrada() {
        assertEquals(2.0, calculadora.raizQuadrada(4));
        assertThrows(IllegalArgumentException.class, () -> calculadora.raizQuadrada(-1));
        assertEquals(0.0, calculadora.raizQuadrada(0));
    }

    // Testes para potência
    @Test
    void testPotencia() {
        assertEquals(8.0, calculadora.potencia(2, 3));
        assertEquals(1.0, calculadora.potencia(2, 0));
        assertThrows(IllegalArgumentException.class, () -> calculadora.potencia(2, -1));
        assertEquals(0.25, calculadora.potencia(2, -2)); // Verificação com potência negativa
    }

    // Testes para porcentagem
    @Test
    void testPorcentagem() {
        assertEquals(10.0, calculadora.porcentagem(100, (int) 0.1));
        assertThrows(IllegalArgumentException.class, () -> calculadora.porcentagem(100, -1));
    }
}
