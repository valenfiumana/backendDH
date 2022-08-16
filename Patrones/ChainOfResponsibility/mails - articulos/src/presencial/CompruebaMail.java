package presencial;

public class CompruebaMail {
    private Manejador inicial;

    public CompruebaMail(){
        //vamos a crear la cadena correspondiente
        inicial= new ManejadorGerencial();
        Manejador tecnico= new ManejadorTecnico();
        Manejador comercial= new ManejadorComercial();
        Manejador spam= new ManejadorSpam();

        //armar la cadena
        inicial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(spam);

    }
    public String comprobar(Mail mail){
        return inicial.comprobarMail(mail);
    }
}
