import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatematicaGptMini {


    // Testes para fatorial
    @Test
    void testFactorial() {
        assertEquals(1, Matematica.factorial(0));
        assertEquals(1, Matematica.factorial(1));
        assertEquals(120, Matematica.factorial(5));
        assertEquals(1, Matematica.factorial(2)); // Caso par
        assertEquals(720, Matematica.factorial(6)); // Caso positivo
    }

    // Testes para soma até um limite
    @Test
    void testSum() {
        assertEquals(6, Matematica.sum(3));
        assertEquals(10, Matematica.sum(4)); // Teste para um limite par
        assertEquals(15, Matematica.sum(5)); // Teste para um limite ímpar
    }

    // Testes para verificação de primo
    @Test
    void testIsPrime() {
        assertTrue(Matematica.isPrime(2));
        assertTrue(Matematica.isPrime(3));
        assertFalse(Matematica.isPrime(4));
        assertFalse(Matematica.isPrime(1));
        assertFalse(Matematica.isPrime(-3)); // Número negativo
        assertTrue(Matematica.isPrime(17)); // Teste com um número primo
        assertFalse(Matematica.isPrime(100)); // Teste com um número não primo
    }
}
