package presencial;

public abstract class Liquidador {
    public String liquidarSueldo(Empleado empleado){
        String respuesta="La liquidación no pudo ser calculada";
        //paso 1 calcular sueldo
        double sueldo=calcularSueldo(empleado);
        //paso 2 emitir el recibo
        //control de si el sueldo es correcto
        if (sueldo>0){
            String recibo=emitirRecibo(empleado);
            //paso 3 depositar el sueldo
            System.out.println(depositarSueldo(empleado));
            //generar la respuesta final
            respuesta=recibo+" Saldo a liquidar: "+sueldo;

        }
        return respuesta;
    }
    protected abstract double calcularSueldo(Empleado empleado);
    protected abstract String emitirRecibo(Empleado empleado);
    private String depositarSueldo(Empleado empleado){
        return "Orden de deposito en la cuenta n°"+empleado.getNumeroDeCuenta();
    }
}
