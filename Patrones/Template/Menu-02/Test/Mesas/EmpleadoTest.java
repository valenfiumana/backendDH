package Mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {
    @Test
    public void prepararMenuTest(){
        Empleado empleado = new Empleado();
        Menu veggie = new Veggie(100.0, 3, 2);
        Menu classic = new Clasic(100.0);
        Menu kids = new Kids(100.0, 2);

        String respEsperada="No agregar nada " +
                "El precio del menu clasico es 100.0";
        String respActual= empleado.prepararMenu(classic);
        assertEquals(respEsperada,respActual);

        String respEsperada2="Agregar 2 juguete(s) " +
                "El precio del menu Kids con 2 juguete es 106.0";
        String respActual2= empleado.prepararMenu(kids);
        assertEquals(respEsperada2,respActual2);

        String respEsperada3="Agregar 3 especias y 2 salsas" +
                " El precio del menu Veggie con 3 especias y 2 salsas es 107.0";
        String respActual3= empleado.prepararMenu(veggie);
        assertEquals(respEsperada3,respActual3);


    }


}