package mesas;

public class AnalisisEnvase extends AnalistaCalidad{
    @Override
    public String comprobarCalidad(Articulo articulo) {
        if(articulo.getEnvasado().equalsIgnoreCase("sano")||articulo.getEnvasado().equalsIgnoreCase("casi sano")){
            return "Aceptado";
        }
        else{
            return "Rechazado. El envase debe estar sano o casi sano";
        }
    }
}
