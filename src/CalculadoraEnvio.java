public class CalculadoraEnvio {

    public static double calcular(double subtotal) {
        if (subtotal > 999.0) {
            return 0.0;
        }

        return 100.0;
    }
}