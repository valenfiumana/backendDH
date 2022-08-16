package presencial;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private Map<String,Computadora> computadorasCreadas=new HashMap<>();

    public Computadora getComputadora(int ram, int disco) {
        //crear una clave para mi mapa
        String clave = "clave:" + ram + ":" + disco;
        //obtener la computadora
        //si la clave ya existe, devolvemos el objeto creado con anterioridad
        // sino creamos un nuevo objeto y no nos olvidamos de colocarlo en
        // la colección
        if (!computadorasCreadas.containsKey(clave)){
            computadorasCreadas.put(clave,new Computadora(ram,disco));
            //return computadorasCreadas.get(clave);
        }
        return computadorasCreadas.get(clave);
    }
}
