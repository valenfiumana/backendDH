package presencial;

public class ProcesaMail {
    private CompruebaMail comprobador;
    private Mail correo;

    public ProcesaMail(Mail correo) {
        this.correo = correo;
        comprobador= new CompruebaMail();
    }

    public CompruebaMail getComprobador() {
        return comprobador;
    }

    public void setComprobador(CompruebaMail comprobador) {
        this.comprobador = comprobador;
    }

    public Mail getCorreo() {
        return correo;
    }

    public void setCorreo(Mail correo) {
        this.correo = correo;
    }
}
