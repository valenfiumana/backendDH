package mesas;

public class ProcesaArt {
    private CompruebaCalidad comprobador;
    private Articulo articulo;

    public ProcesaArt(Articulo articulo){
        this.articulo=articulo;
        this.comprobador=new CompruebaCalidad();
    }

    public CompruebaCalidad getComprobador() {
        return comprobador;
    }

    public void setComprobador(CompruebaCalidad comprobador) {
        this.comprobador = comprobador;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
