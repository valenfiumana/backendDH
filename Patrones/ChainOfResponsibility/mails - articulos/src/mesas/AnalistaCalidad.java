package mesas;

public abstract class AnalistaCalidad {
    private AnalistaCalidad siguienteAnalista;

    public abstract String comprobarCalidad(Articulo articulo);

    public AnalistaCalidad getSiguienteAnalista() {
        return siguienteAnalista;
    }

    public void setSiguienteAnalista(AnalistaCalidad siguienteAnalista) {
        this.siguienteAnalista = siguienteAnalista;
    }
}
