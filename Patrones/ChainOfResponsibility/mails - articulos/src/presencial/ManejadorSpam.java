package presencial;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        return "Marcado como spam";
    }
}
