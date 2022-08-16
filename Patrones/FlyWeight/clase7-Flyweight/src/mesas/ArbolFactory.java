package mesas;
import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private static Map<String, Arbol> ARBOL_MAP=new HashMap<>();

    public static Arbol getArbol(String tipo) {
        Arbol arbol = null;
        if (ARBOL_MAP.containsKey(tipo))
            arbol = ARBOL_MAP.get(tipo);
        else {
            switch(tipo) {
                case "Ornamental":
                    System.out.println("Ornamental creado");
                    arbol = new Arbol("Ornamental", "verde", 400.0, 200.0);
                    break;
                case "Frutal":
                    System.out.println("Frutal creado");
                    arbol = new Arbol("Frutal", "rojo", 300.0, 500.0);
                    break;
                case "Floral":
                    System.out.println("Floral creado");
                    arbol = new Arbol("Floral", "celeste", 200.0, 100.0);
                    break;
                default :
                    System.out.println("Ese tipo de arbol no existe!");
            }

            // Una vez creado, insertar en hashMap
            ARBOL_MAP.put(tipo, arbol);
        }
        return arbol;
    }
}
