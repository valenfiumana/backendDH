package presencial;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public boolean esMayorDeEdad(){
        return getEdad()>=18;
    }

    public boolean siElNombreEsMayorA5Letras(){
        return getNombre().length()>=5;
    }
}
