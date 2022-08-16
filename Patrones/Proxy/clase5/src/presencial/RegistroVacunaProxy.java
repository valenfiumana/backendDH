package presencial;

import java.time.LocalDate;

public class RegistroVacunaProxy implements Registro{
    private RegistroVacuna centroDeVacunacion;
/*alternativa a
*/
    public RegistroVacunaProxy() {
        this.centroDeVacunacion = new RegistroVacuna();
    }

    public RegistroVacuna getCentroDeVacunacion() {
        return centroDeVacunacion;
    }

    public void setCentroDeVacunacion(RegistroVacuna centroDeVacunacion) {
        this.centroDeVacunacion = centroDeVacunacion;
    }

    @Override
    public String vacunar(Persona persona) {
        if (LocalDate.now().isAfter(persona.getFechaAsignada())||
        LocalDate.now().isEqual(persona.getFechaAsignada())){
            //alternativa b
            //centroDeVacunacion=new RegistroVacuna();
            return centroDeVacunacion.vacunar(persona);
        }else{
            return "No es su turno, vuelva cuando sea correspondiente. :D";
        }
    }
}
