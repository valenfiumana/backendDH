package presencial;

public class FacadeDescuento implements IDescuento{
    private ApiCantidad apiCantidad;
    private ApiTarjeta apiTarjeta;
    private ApiProducto apiProducto;

    public FacadeDescuento(){
        apiCantidad= new ApiCantidad();
        apiProducto= new ApiProducto();
        apiTarjeta= new ApiTarjeta();
    }
    @Override
    public int descuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        //llamar a los métodos de las otras clases
        int descuentoFinal=0;
        //verificar Tarjeta
        descuentoFinal=descuentoFinal+apiTarjeta.descuentoXTarjeta(tarjeta);
        //verificar Producto
        descuentoFinal=descuentoFinal+apiProducto.descuentoXProducto(producto);
        //verificar Cantidad
        descuentoFinal=descuentoFinal+apiCantidad.descuentoXCantidad(cantidad);
        return descuentoFinal;
    }
}
