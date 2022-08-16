package mesas;

import presencial.Triangulo;

import java.util.HashMap;
import java.util.Map;

public class RopaFactory {
    private static Map<String, Ropa> ropaMap = new HashMap<>();

    public static Ropa getRopa(String tipo, String talle, boolean importada, boolean esNuevo) {
        Ropa ropa = ropaMap.get(tipo);
        if (ropa == null) {
            ropa = new Ropa(talle, tipo, esNuevo, importada);
            ropaMap.put(tipo, ropa);
        }
        return ropa;
    }
}
