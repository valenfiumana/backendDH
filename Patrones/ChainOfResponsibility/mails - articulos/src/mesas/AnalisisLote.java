package mesas;

public class AnalisisLote extends AnalistaCalidad{
    @Override
    public String comprobarCalidad(Articulo articulo) {
        if(articulo.getLote()>1000 &&articulo.getLote()<2000){
            return getSiguienteAnalista().comprobarCalidad(articulo);
        }
        else{
            return "Rechazado. El lote debe estar entre 1000 y 2000";
        }
    }
}
