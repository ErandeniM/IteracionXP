public class CalculadoraEnvio {

    private static final double MINIMO_TARIFA_REDUCIDA = 500.0;
    private static final double MINIMO_ENVIO_GRATIS = 1000.0;

    private static final double TARIFA_COMPLETA = 100.0;
    private static final double TARIFA_REDUCIDA = 50.0;
    private static final double ENVIO_GRATIS = 0.0;

    public static double calcular(double importePedido) {
        return calcular(importePedido, false);
    }

    public static double calcular(double importePedido, boolean esPremium) {
        if (esPremium) {
            return ENVIO_GRATIS;
        }
        if (importePedido < MINIMO_TARIFA_REDUCIDA) {
            return TARIFA_COMPLETA;
        }
        if (importePedido < MINIMO_ENVIO_GRATIS) {
            return TARIFA_REDUCIDA;
        }
        return ENVIO_GRATIS;
    }
}