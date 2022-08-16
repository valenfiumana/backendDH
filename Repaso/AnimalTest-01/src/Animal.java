public class Animal {
    private String tipo; //caballo, perro, gato
    private String size; //grande, mediano, chico
    private Integer peso;

    public Animal(String tipo, String size, Integer peso) {
        this.tipo = tipo;
        this.size = size;
        this.peso = peso;
    }

    public boolean esPesado(){
        return peso>2000 && size.equals("grande");
    }
}
