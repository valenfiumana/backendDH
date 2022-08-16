package presencial;

public class LiquidadorEmpleadoContratado extends Liquidador{
    @Override
    protected double calcularSueldo(Empleado empleado) {
        double respuesta=0;
        if (empleado instanceof EmpleadoContratado){
            EmpleadoContratado emp=(EmpleadoContratado) empleado;
            respuesta=emp.getCantidadHoras()*emp.getValorHoras();
        }
        return respuesta;
    }

    @Override
    protected String emitirRecibo(Empleado empleado) {
        return "La liquidación generada es un documento digital.";
    }
}
