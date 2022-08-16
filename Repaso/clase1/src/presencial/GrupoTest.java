package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    public void agregarPersonasTest1(){
        Grupo grupo= new Grupo();
        Persona persona1=new Persona("Juan","Díaz",20);
        Persona persona2=new Persona("Pedro","Díaz",25);
        Persona persona3=new Persona("Ana","Díaz",15);
        Persona persona4=new Persona("Luz","Díaz",48);
        Persona persona5=new Persona("Julían","Díaz",37);

        grupo.agregarPersona(persona1);
        grupo.agregarPersona(persona2);
        grupo.agregarPersona(persona3);
        grupo.agregarPersona(persona4);
        grupo.agregarPersona(persona5);

        assertEquals(2,grupo.cantidadPersonas());
    }
}