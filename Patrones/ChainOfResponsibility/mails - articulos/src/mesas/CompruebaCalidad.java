package mesas;

import presencial.*;

public class CompruebaCalidad {
    private AnalistaCalidad inicial;

    public CompruebaCalidad(){
        inicial= new AnalisisLote();
        AnalistaCalidad peso = new AnalisisPeso();
        AnalistaCalidad envase = new AnalisisEnvase();
        //armar la cadena
        inicial.setSiguienteAnalista(peso);
        peso.setSiguienteAnalista(envase);

    }
    public String comprobar(Articulo articulo){
        return inicial.comprobarCalidad(articulo);
    }
}
