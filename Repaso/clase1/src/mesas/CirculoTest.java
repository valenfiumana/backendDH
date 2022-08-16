package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    @Test
    public void calcularAreaTest(){
        Circulo circulo = new Circulo(1.0);
        Circulo circulo2 = new Circulo(0.0);

        assertEquals(Math.PI, circulo.calcularArea());
        assertEquals(0.0, circulo2.calcularArea());
    }
}