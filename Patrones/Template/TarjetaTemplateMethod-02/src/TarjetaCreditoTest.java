import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarjetaCreditoTest {
    @Test
    public void autorizarPagoTest(){
        TarjetaCredito tarjeta = new TarjetaCredito(73738383, 324, "23/07/2023", false, 23000.0);
        TarjetaCredito tarjeta2 = new TarjetaCredito(73738383, 324, "23/07/2022", false, 3000.0);
        TarjetaCredito tarjeta3 = new TarjetaCredito(73738383, 324, "3/12/2022", false, 3000.0);

        assertEquals(true, tarjeta.getFechaValida());
        tarjeta.procesarPago(3000.0);
        assertEquals(true, tarjeta.getAutorizacion());
    }
}