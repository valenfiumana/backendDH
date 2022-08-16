package presencial;

public class EmpleadoContratado extends Empleado{
    private int cantidadHoras;
    private double valorHoras;

    public EmpleadoContratado(String nombre, String apellido, String numeroDeCuenta, int cantidadHoras, double valorHoras) {
        super(nombre, apellido, numeroDeCuenta);
        this.cantidadHoras = cantidadHoras;
        this.valorHoras = valorHoras;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
}
