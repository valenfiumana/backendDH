package presencial;

public class ManejadorTecnico extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        if (mail.getDestino().equals("tecnica@colmena.com")
                ||mail.getTema().equals("Técnico")){
            return "Enviado a tecnica";
        }
        else{
            return getSiguienteManejador().comprobarMail(mail);
        }
    }
}
