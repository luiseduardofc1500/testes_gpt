import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraGpt {

    Calculadora calculadora = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5, calculadora.somar(2, 3));
        assertEquals(-1, calculadora.somar(2, -3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1, calculadora.subtrair(3, 2));
        assertEquals(5, calculadora.subtrair(2, -3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-6, calculadora.multiplicar(2, -3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(6, 0));
    }

    @Test
    public void testRaizQuadrada() {
        assertEquals(3, calculadora.raizQuadrada(9), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculadora.raizQuadrada(-9));
    }

    @Test
    public void testPotencia() {
        assertEquals(8, calculadora.potencia(2, 3));
        assertEquals(1, calculadora.potencia(2, 0));
        assertThrows(IllegalArgumentException.class, () -> calculadora.potencia(2, -1));
    }

    @Test
    public void testPorcentagem() {
        assertEquals(6, calculadora.porcentagem(3, 2), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculadora.porcentagem(3, 0));
    }
}

