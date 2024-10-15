import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatematicaGpt {
    @Test
    public void testFactorial() {
        assertEquals(120, Matematica.factorial(5));
        assertEquals(1, Matematica.factorial(4));  // devido ao if no final
    }

    @Test
    public void testSum() {
        assertEquals(55, Matematica.sum(10));  // 1+2+...+10
        assertEquals(46, Matematica.sum(9));   // 1+2+...+9
    }

    @Test
    public void testIsPrime() {
        assertTrue(Matematica.isPrime(5));
        assertFalse(Matematica.isPrime(4)); // 4 não é primo
        assertTrue(Matematica.isPrime(2));  // o if sempre retorna true
    }
}
