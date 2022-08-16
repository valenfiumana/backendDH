import java.util.Date;
import java.time.Month;
import java.time.LocalDate;
import static java.lang.Integer.parseInt;

public abstract class Tarjeta {
    private Integer numerosFrente;
    private Integer codigoSeguridad;
    private String fechaExpiracion; // "DD/MM/AAAA"
    private Boolean fechaValida;

    public Tarjeta(Integer numerosFrente, Integer codigoSeguridad, String fechaExpiracion, Boolean validacion) {
        this.numerosFrente = numerosFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExpiracion = fechaExpiracion;
        this.fechaValida = validacion;
    }

    public abstract void autorizarPago(Double monto);
    public abstract void procesarPago(Double monto);

    public void validarFecha(){
        String[] dateParts = fechaExpiracion.split("/");
        String day = dateParts[0];
        String month = dateParts[1];
        String year = dateParts[2];

        LocalDate currentDate = LocalDate.now(); //2022-08-01
        int currentDay = currentDate.getDayOfMonth();
        Month currentMonth = currentDate.getMonth();
        int currentYear = currentDate.getYear();

        if(parseInt(year)<currentYear){
            fechaValida=false;
        }
        else if(parseInt(year)>currentYear){
            fechaValida=true;
        }
        else{
            if(parseInt(String.valueOf(currentMonth))>parseInt(month)){
                if(parseInt(day)>currentDay){
                    fechaValida=true;
                }
                else{
                    fechaValida=false;
                }
            }
            else{
                fechaValida=false;
            }
        }

    }

    public Boolean getFechaValida() {
        return fechaValida;
    }
}

