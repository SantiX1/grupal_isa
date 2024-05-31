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
        assertEquals(resultadoEsperado, resultadoObtenido,0.001);
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
        assertEquals(resultadoEsperado, resultadoObtenido, 0.001);
    }

    @Test
    void testMultiplicacion() {
        // Arrange
        double a = 3.456d;
        double b = 7.89d;
        double resultadoEsperado = 27.26784d;
        // Act
        double resultadoObtenido = Calculadora.multiplicacion(a, b);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido, 0.001);
    }

    @Test
    void testDivision() {
        // Arrange
        double a = 3.456d;
        double b = 7.89d;
        double resultadoEsperado = 0.438022813688d;
        // Act
        double resultadoObtenido = Calculadora.division(a, b);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido, 0.001);
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
        double a = 7.89d;
        double resultadoEsperado = 2.808914381037627d;
        // Act
        double resultadoObtenido = Calculadora.raizCuadrada(a);
        // Assert
        assertEquals(resultadoEsperado, resultadoObtenido,0.001);
    }

    @Test
    void testRaizCuadradaNegativa() {
        // Arrange
        double a = -7.89d;
        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.raizCuadrada(a);
        });
        assertEquals("No se puede calcular la raíz cuadrada de un número negativo", exception.getMessage());
    }

}
