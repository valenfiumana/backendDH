package mesas;

public class Circulo implements Figura{
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        if(radio>0){
            return Math.PI * Math.pow(radio, 2);
        }
        else{
            System.out.println("“El valor del radio o lado debe ser mayor que cero”\n");
            return 0.0;
        }
    }
}
