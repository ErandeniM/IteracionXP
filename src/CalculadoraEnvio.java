public class CalculadoraEnvio {

    public static double calcular(double importePedido, boolean esPremium) {

        if (esPremium) {
            return 0.0;
        }

        if (importePedido < 500) {
            return 100.0;
        }

        if (importePedido < 1000) {
            return 50.0;
        }

        return 0.0;
    }
}