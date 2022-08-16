package presencial;

public class GrilladePeliculasProxy implements IGrillaDePeliculas{
    private GrillaDePeliculas grilla;
    private IP dirIp;
    public GrilladePeliculasProxy(IP dir){
        grilla=new GrillaDePeliculas();
        dirIp=dir;
    }

    @Override
    public Pelicula getPelicula(String nombrePelicula) throws PeliculaNoHabilitadaException {
        //que el pais de la pelicula sea igual al pais de la dirección
        //buscar la pelicula
        Pelicula peliculaBuscada=grilla.getPelicula(nombrePelicula);
        //realizar la comparación
        String origenPelicula=peliculaBuscada.getPais();
        String origenDireccion=dirIp.getPais();
        if (!origenPelicula.equals(origenDireccion)){
            throw new PeliculaNoHabilitadaException(
                    nombrePelicula+" no disponible para "+origenDireccion);
        }
        else{
            return peliculaBuscada;
        }
    }

    public GrillaDePeliculas getGrilla() {
        return grilla;
    }

    public void setGrilla(GrillaDePeliculas grilla) {
        this.grilla = grilla;
    }

    public IP getDirIp() {
        return dirIp;
    }

    public void setDirIp(IP dirIp) {
        this.dirIp = dirIp;
    }
}
