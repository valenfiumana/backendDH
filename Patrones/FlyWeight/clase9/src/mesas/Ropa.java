package mesas;

public class Ropa {
    private String talle;
    private String tipo;
    private boolean esNueva;
    private boolean importada;

    public Ropa(String talle, String tipo, boolean esNueva, boolean importada) {
        this.talle = talle;
        this.tipo = tipo;
        this.importada = importada;
        this.esNueva = esNueva;
    }

    @Override
    public String toString() {
        String estado;
        String origen;
        if(esNueva){
            estado="nuevo";
        }
        else{
            estado="usado";
        }

        if(importada){
            origen="importado";
        }
        else{
            origen="nacional";
        }
        return tipo + importada + estado + " talle " + talle;
    }
}
