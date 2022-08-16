package presencial;

public class Triangulo {
    //cada triangulo se identifica con su color según contexto
    private String color;
    private int tamano;

    public Triangulo(String color, int tamano) {
        this.color = color;
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Triangulo de color "+ color+ "de tamaño "+ tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}
