import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void testMultiplicacion() {
        // Arrange
        double a = 3.456d;
        double b = 7.89d;
        double resultadoEsperado = 27.28784d;
        // Act
        double resultadoObtenido = Calculadora.multiplicacion(a, b);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido, 3);
    }

    @Test
    void testDivision() {
        // Arrange
        double a = 3.456d;
        double b = 7.89d;
        double resultadoEsperado = 0.436d;
        // Act
        double resultadoObtenido = Calculadora.division(a, b);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido, 3);
    }

    @Test
    void testDivisionPorCero() {
        // Arrange
        double a = 3.456d;
        double b = 0d;
        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.division(a, b);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    void testRaizCuadrada() {
        // Arrange
        double a = 7d;
        double resultadoEsperado = 2.645751311064590d;
        // Act
        double resultadoObtenido = Calculadora.raizCuadrada(a);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido, 3);
    }
}
