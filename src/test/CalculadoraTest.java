import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void testSuma() {
        // Arrange
        double a = 3.456;
        double b = 7.89;
        double resultadoEsperado = 11.346;
        // Act
        double resultadoObtenido = Calculadora.suma(a, b);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void testResta() {
        // Arrange
        double a = 3.456;
        double b = 7.89;
        double resultadoEsperado = -4.434;
        // Act
        double resultadoObtenido = Calculadora.resta(a, b);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
