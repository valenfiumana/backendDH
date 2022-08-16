package mesas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BusquedaHotel {

    private List<Hotel> hotelList;

    public BusquedaHotel() {
        hotelList = new ArrayList<>();
    }
    public void agregarHotel(Hotel hotel){
        hotelList.add(hotel);
    }

    public void busquedaHoteles(String cuidad, LocalDate fechaLlegada, LocalDate fechaSalida){
        for (Hotel hotel : hotelList) {
            if (hotel.getCuidad().equals(cuidad) && hotel.getFechaEntrada().equals(fechaLlegada)
                    && hotel.getFechaSalida().equals(fechaSalida)){
                System.out.println(hotel);
            }
        }
    }
}
