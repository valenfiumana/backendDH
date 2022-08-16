package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {
    @Test
    public void emitirReciboParaEmpleadoEfectivo(){
        Liquidador liquidador= new LiquidadorEmpleadoEfectivo();
        Empleado empleado= new EmpleadoEfectivo("Martín","Martini"
        ,"CA5848421548",400,40,60);
        String respEsperada="La liquidación generada es un documento escrito." +
                " Saldo a liquidar: 420.0";
        String respActual=liquidador.liquidarSueldo(empleado);
        assertEquals(respEsperada,respActual);
    }
}