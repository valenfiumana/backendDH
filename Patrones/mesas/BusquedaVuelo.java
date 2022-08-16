package mesas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BusquedaVuelo {

    private List<Vuelo> vueloList;

    public BusquedaVuelo() {
        vueloList = new ArrayList<>();
    }
    public void agregarVuelos(Vuelo vuelo){
        vueloList.add(vuelo);
    }

    public void buscarVuelos (String cuidad, LocalDate fechaLlegada, LocalDate fechaSalida){
        for (Vuelo vuelo : vueloList) {
            if (vuelo.getDestino().equals(cuidad) && vuelo.getFechaSalida().equals(fechaLlegada)
                    && vuelo.getFechaRegreso().equals(fechaSalida)){
                System.out.println(vuelo);
            }
        }
    }
}
