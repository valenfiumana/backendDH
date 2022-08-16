package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {
    @Test
    public void calcularAreaTest(){
        Cuadrado cuadrado = new Cuadrado(3.0);
        Cuadrado cuadrado2 = new Cuadrado(-1.0);

        assertEquals(9.0, cuadrado.calcularArea());
        assertEquals(0.0, cuadrado2.calcularArea());
    }
}