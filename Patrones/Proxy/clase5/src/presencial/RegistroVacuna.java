package presencial;

public class RegistroVacuna implements Registro{
    @Override
    public String vacunar(Persona persona) {
        // puede gastar la vacuna sin problemas, sin miedo
        System.out.println("Se gasto una vacuna");
        return ("Se ha registrado el DNI "+persona.getDNI()+
                " como persona vacunada con "+persona.getNombreVacuna());
    }
}
