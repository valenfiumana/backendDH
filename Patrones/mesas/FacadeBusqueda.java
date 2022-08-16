package mesas;

import java.time.LocalDate;

public class FacadeBusqueda implements IBusqueda{

    private BusquedaHotel busquedaHotel;
    private BusquedaVuelo busquedaVuelo;

    public FacadeBusqueda(){
        busquedaHotel = new BusquedaHotel();
        busquedaVuelo = new BusquedaVuelo();
    }

    @Override
    public void busqueda(String cuidad, LocalDate fechaLlegada, LocalDate fechaSalida) {
        System.out.println("Hoteles disponebles");
        busquedaHotel.busquedaHoteles(cuidad,fechaLlegada,fechaSalida);
        System.out.println("Vuelos disponibles");
        busquedaVuelo.buscarVuelos(cuidad,fechaLlegada,fechaSalida);
    }

    public BusquedaHotel getBusquedaHotel() {
        return busquedaHotel;
    }

    public void setBusquedaHotel(BusquedaHotel busquedaHotel) {
        this.busquedaHotel = busquedaHotel;
    }

    public BusquedaVuelo getBusquedaVuelo() {
        return busquedaVuelo;
    }

    public void setBusquedaVuelo(BusquedaVuelo busquedaVuelo) {
        this.busquedaVuelo = busquedaVuelo;
    }
}
