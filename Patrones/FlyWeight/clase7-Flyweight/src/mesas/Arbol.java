package mesas;

public class Arbol {
    private String tipo;
    private String color;
    private Double ancho;
    private Double alto;

    public Arbol(String tipo, String color, Double ancho, Double alto) {
        this.tipo = tipo;
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
