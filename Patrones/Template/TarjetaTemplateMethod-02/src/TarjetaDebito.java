public class TarjetaDebito extends Tarjeta{
    private Double saldo;

    public TarjetaDebito(Integer numerosFrente, Integer codigoSeguridad, String fechaExpiracion, Boolean validacion, Double saldo) {
        super(numerosFrente, codigoSeguridad, fechaExpiracion, validacion);
        this.saldo = saldo;
    }

    @Override
    public void autorizarPago(Double monto) {
        if(getFechaValida() && (saldo-monto>=0)){
            System.out.println("El pago fue autorizado");
            procesarPago(monto);
        }
        else if (!getFechaValida()){
            System.out.println("La tarjeta ha expirado");
        }
        else if(saldo-monto<0){
            System.out.println("La tarjeta no tiene fondos");
        }
    }

    @Override
    public void procesarPago(Double monto) {
        saldo-=monto;
    }
}
