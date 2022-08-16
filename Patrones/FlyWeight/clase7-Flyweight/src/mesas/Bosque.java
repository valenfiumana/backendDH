package mesas;

import java.util.ArrayList;
import java.util.List;

public class Bosque {
    private List<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(String tipo){
        this.arboles.add(ArbolFactory.getArbol(tipo));
    }

    public void getArbolesPorColor(){
        int rojo=0, verde=0, celeste=0;
        for (Arbol arbol : arboles){
            if(arbol.getColor().equalsIgnoreCase("rojo")){
                rojo++;
            }
            else if(arbol.getColor().equalsIgnoreCase("verde")){
                verde++;
            }
            if(arbol.getColor().equalsIgnoreCase("celeste")){
                celeste++;
            }
        }
        System.out.println("Se plantaron "+rojo+" arboles rojos, "+verde+" verdes y "+celeste+" celestes");
    }
}
