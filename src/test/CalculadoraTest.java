import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void testSuma() {
        // Arrange
        double a = 3.456d;
        double b = 7.89d;
        double resultadoEsperado = 11.346d;
        // Act
        double resultadoObtenido = Calculadora.suma(a, b);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido,3);
    }

    @Test
    void testResta() {
        // Arrange
        double a = 3.456d;
        double b = 7.89d;
        double resultadoEsperado = -4.434d;
        // Act
        double resultadoObtenido = Calculadora.resta(a, b);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido, 3);
    }
}
