import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void testSuma() {
        // Arrange
        Calculadora calculadora = new Calculadora();
        // Act
        int resultado = calculadora.suma(3, 2);
        // Assert
        assertEquals(5, resultado);
    }
}
