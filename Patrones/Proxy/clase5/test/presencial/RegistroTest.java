package presencial;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {
    @Test
    public void vacunarPersonaOkTest(){
        Persona persona= new Persona("Rodolfo","Baspineiro",
                "5855","Moderna",
                LocalDate.of(2022,8,4));
        Registro registro=new RegistroVacunaProxy();
        String respEsperada="Se ha registrado el DNI 5855 como persona vacunada " +
                "con Moderna";
        String respActual=registro.vacunar(persona);
        assertEquals(respEsperada,respActual);
    }
}