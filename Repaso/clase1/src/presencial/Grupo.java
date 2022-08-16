package presencial;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> personas;

    public Grupo(){
        personas=new ArrayList<>();
    }

    public void agregarPersona(Persona persona){
        //vamos a chequear si corresponde que ingrese a nuestro grupo
        if (persona.esMayorDeEdad()&&persona.siElNombreEsMayorA5Letras()){
            personas.add(persona);
        }
        else{
            System.out.println("No se puede agregar a "+persona.getNombre());
        }
    }
    public int cantidadPersonas(){
        return personas.size();
    }
}
