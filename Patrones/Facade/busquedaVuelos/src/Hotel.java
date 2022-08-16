public class Hotel {
    private String nombre;
    private String ciudad;
    private String checkin;
    private String checkout;

    public Hotel(String nombre, String ciudad, String checkin, String checkout) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }
}
