package mesas;

public class AnalisisPeso extends AnalistaCalidad{
    @Override
    public String comprobarCalidad(Articulo articulo) {
        if(articulo.getPeso()>1200 && articulo.getPeso()<1300){
            return getSiguienteAnalista().comprobarCalidad(articulo);
        }
        else{
            return "Rechazado. El peso debe estar entre 1200 y 1300";
        }
    }
}
