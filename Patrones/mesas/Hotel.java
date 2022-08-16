package mesas;

import java.time.LocalDate;

public class Hotel {

    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private String cuidad;

    public Hotel(LocalDate fechaEntrada, LocalDate fechaSalida, String cuidad) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cuidad = cuidad;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public String getCuidad() {
        return cuidad;
    }

    @Override
    public String toString() {
        return "Cuidad " + cuidad + " fechas disponibles: "+fechaEntrada+ " hasta " +fechaSalida;
    }
}
