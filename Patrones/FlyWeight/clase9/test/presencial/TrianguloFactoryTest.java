package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloFactoryTest {
    @Test
    public void triangulosRojosTest(){
        /*
        TrianguloFactory trianguloFactory= new TrianguloFactory();
        Triangulo triangulo1=trianguloFactory.obtenerTriangulo("rojo",2);
        Triangulo triangulo2=trianguloFactory.obtenerTriangulo("rojo",4);
*/
        Triangulo triangulo1=TrianguloFactory.obtenerTriangulo("rojo",2);
        Triangulo triangulo2=TrianguloFactory.obtenerTriangulo("rojo",4);
        triangulo2.setTamano(4);

        triangulo1.setTamano(2);

        triangulo2.setTamano(4);

        assertEquals(4,triangulo2.getTamano());
    }
}