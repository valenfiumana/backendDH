package com.dh.banco.service;

public abstract class EmpleadoBanco { //clase MANEJADORA

    protected EmpleadoBanco sigEmpleadoBanco;

    public abstract void procesarSolicitud(Integer monto);

    public EmpleadoBanco setSigEmpleadoBanco(EmpleadoBanco sigEmpleadoBanco) { //responsable de arrancar cadena
        this.sigEmpleadoBanco = sigEmpleadoBanco;
        return this;
    }
}
