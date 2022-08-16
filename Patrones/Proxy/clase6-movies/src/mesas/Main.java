package mesas;

import presencial.PeliculaNoHabilitadaException;

public class Main {
    public static void main(String[] args) {
        ProxyMovie proxy = new ProxyMovie(4);

        try{
            System.out.println(proxy.getMovie("spiderman"));
        }
        catch (MovieException exception){
            exception.printStackTrace();
        }

        try{
            System.out.println(proxy.getMovie("spiderman2"));
        }
        catch (MovieException exception){
            exception.printStackTrace();
        }


    }

}
