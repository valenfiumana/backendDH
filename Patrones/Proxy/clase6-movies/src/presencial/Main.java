package presencial;

public class Main {
    public static void main(String[] args) {
        IP direccion=new IP(150,98,52,74);
        GrilladePeliculasProxy proxy= new GrilladePeliculasProxy(direccion);
        String pelicula="Peli1";

        //mostrar el link
        try{
            System.out.println(proxy.getPelicula(pelicula).getLink());
        }
        catch (PeliculaNoHabilitadaException exception){
            exception.printStackTrace();
        }

    }
}
