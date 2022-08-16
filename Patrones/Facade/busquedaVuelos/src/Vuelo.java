import java.time.LocalDate;
import java.util.Locale;

public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fechaSalida;
    private LocalDate fechaRegreso;

    public Vuelo(String codigo, String origen, String destino, LocalDate fechaSalida, LocalDate fechaRegreso) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
    }
}
