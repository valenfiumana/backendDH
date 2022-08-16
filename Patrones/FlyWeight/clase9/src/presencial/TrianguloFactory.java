package presencial;

import java.util.HashMap;
import java.util.Map;

public class TrianguloFactory {
    //private Map<String, Triangulo> trianguloMap= new HashMap<>();
    private static Map<String, Triangulo> trianguloMap= new HashMap<>();
    public static Triangulo obtenerTriangulo(String color, int tam){
        //devolver el objeto según un control
        //clave - la clave es el color que viene por param

        Triangulo triangulo= trianguloMap.get(color);
        //caso negativo no lo encuentra
        if (triangulo==null){
            triangulo=new Triangulo(color,tam);
            trianguloMap.put(color,triangulo);
        }
        return triangulo;

    }
}
