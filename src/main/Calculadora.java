public class Calculadora {

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    public static double raizCuadrada(double a) {
        // Método de Bakhsali
        // copiado de:
        // https://censorcosmico.blogspot.com/2018/07/calculo-raiz-cuadrada-usando-metodo_1.html

        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }

        // Definición variables
        double n = 0, r;
        double min = Double.MAX_VALUE;
        double aux;

        // Busca número más cercano
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            r = i * i;
            aux = Math.abs(r - a);
            if (aux < min) {
                n = i;
                min = aux;
            } else {
                break;
            }
        }

        // Formula método Bakhsali + aproximación
        double numerador = Math.pow(n, 4) + 6 * Math.pow(n, 2) * a + Math.pow(a, 2);
        double denominador = 4 * Math.pow(n, 3) + (4 * n * a);
        double m_bakhsali = numerador / denominador;

        return m_bakhsali;
    }
}
