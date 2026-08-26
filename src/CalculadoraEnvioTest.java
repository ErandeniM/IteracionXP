import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraEnvioTest {

    @Test
    void pedidoMenorA500CobraTarifaCompleta() {
        assertEquals(100.0, CalculadoraEnvio.calcular(400.0), 0.001);
    }

    @Test
    void pedidoIntermedioCobraTarifaReducida() {
        assertEquals(50.0, CalculadoraEnvio.calcular(700.0), 0.001);
    }

    @Test
    void pedidoDe1000OMasTieneEnvioGratis() {
        assertEquals(0.0, CalculadoraEnvio.calcular(1200.0), 0.001);
    }

    // Fronteras
    @Test
    void frontera_499_99_cobraTarifaCompleta() {
        assertEquals(100.0, CalculadoraEnvio.calcular(499.99), 0.001);
    }

    @Test
    void frontera_500_cobraTarifaReducida() {
        assertEquals(50.0, CalculadoraEnvio.calcular(500.00), 0.001);
    }

    @Test
    void frontera_999_99_cobraTarifaReducida() {
        assertEquals(50.0, CalculadoraEnvio.calcular(999.99), 0.001);
    }

    @Test
    void frontera_1000_tieneEnvioGratis() {
        assertEquals(0.0, CalculadoraEnvio.calcular(1000.00), 0.001);
    }
}