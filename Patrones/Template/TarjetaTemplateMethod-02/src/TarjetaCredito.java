public class TarjetaCredito extends Tarjeta{
    private Double limite;
    private boolean autorizacion;

    public TarjetaCredito(Integer numerosFrente, Integer codigoSeguridad, String fechaExpiracion, Boolean validacion, Double limite) {
        super(numerosFrente, codigoSeguridad, fechaExpiracion, validacion);
        this.limite = limite;
    }

    @Override
    public void autorizarPago(Double monto) {
        if(getFechaValida() && (limite-monto>=0)){
            System.out.println("El pago fue autorizado");
            autorizacion=true;
            procesarPago(monto);
        }
        else if (!getFechaValida()){
            System.out.println("La tarjeta ha expirado");
            autorizacion=false;
        }
        else if(limite-monto<0){
            System.out.println("Se ha excedido el limite");
            autorizacion=false;
        }
    }

    @Override
    public void procesarPago(Double monto) {
        limite-=monto;
    }

    public boolean getAutorizacion() {
        return autorizacion;
    }
}
