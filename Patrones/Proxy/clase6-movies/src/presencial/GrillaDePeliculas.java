package presencial;

public class GrillaDePeliculas implements IGrillaDePeliculas{
    @Override
    public Pelicula getPelicula(String nombrePelicula) throws PeliculaNoHabilitadaException {
        Pelicula pelicula=null;
        switch(nombrePelicula){
            case "Peli1":
                pelicula= new Pelicula("Peli1","Argentina",
                        "www.peliculas.com/peli1");
                break;
            case "Peli2":
                pelicula= new Pelicula("Peli2","Brasil",
                        "www.peliculas.com/peli2");
                break;
            case "Peli3":
                pelicula= new Pelicula("Peli3","Colombia",
                        "www.peliculas.com/peli3");
                break;
                //control de una pelicula inexistente.
        }
        return pelicula;
    }
}
