import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void siAnimalEsPesado(){
        Animal caballo = new Animal("caballo", "grande", 5000);
        Animal perro = new Animal("perro", "mediano", 20);

        boolean caballoPesado = caballo.esPesado();
        boolean perroPesado = perro.esPesado();

        assertEquals(true, caballoPesado);
        assertFalse(perroPesado);
    }
}