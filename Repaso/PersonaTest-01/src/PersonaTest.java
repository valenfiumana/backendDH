import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @org.junit.jupiter.api.Test
    void mostrarNombre() {
        Persona persona = new Persona("Valen", "Fiumana", "valfiu@gmail.com", 20);
        assertEquals("Fiumana, Valen", persona.mostrarNombre());
    }

    @org.junit.jupiter.api.Test
    void esMayor() {

    }
}