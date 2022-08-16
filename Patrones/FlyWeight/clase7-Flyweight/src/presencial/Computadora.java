package presencial;

public class Computadora {
    private String id;
    private int ram;
    private int disco;
    private static int contador;

    public Computadora(String id, int ram, int disco) {
        this.id = id;
        this.ram = ram;
        this.disco = disco;
        contador++;
    }

    public Computadora(int ram, int disco) {
        this.ram = ram;
        this.disco = disco;
        contador++;
    }

    @Override
    public String toString(){
        return "Computadora [ram:"+ram+",disco:"+disco+"]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Computadora.contador = contador;
    }
}
