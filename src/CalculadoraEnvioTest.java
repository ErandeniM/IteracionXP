import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraEnvioTest {

    @Test
    void cobraTarifaBaseEnPedidoNormal() {
        assertEquals(100.0, CalculadoraEnvio.calcular(500.0));
    }

    @Test
    void envioGratisEnPedidoMayorA999() {
        assertEquals(0.0, CalculadoraEnvio.calcular(1500.0));
    }

    @Test
    void envioGratisEnElLimiteDe1000() {
        assertEquals(0.0, CalculadoraEnvio.calcular(1000.0));
    }

    @Test
    void tarifaBaseJustoEn999() {
        assertEquals(100.0, CalculadoraEnvio.calcular(999.0));
    }
}