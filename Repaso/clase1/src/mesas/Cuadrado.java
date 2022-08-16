package mesas;

public class Cuadrado implements Figura{
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        if(lado>0){
            return lado*lado;
        }
        else{
            System.out.println("“El valor del radio o lado debe ser mayor que cero”\n");
            return 0.0;
        }
    }
}
