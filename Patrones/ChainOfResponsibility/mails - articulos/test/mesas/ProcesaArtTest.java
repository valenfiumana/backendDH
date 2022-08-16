package mesas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProcesaArtTest {
    @Test
    public void analisisDeCalidad(){
        Articulo articulo = new Articulo("Resaltadores", 1100, 1250, "sano");
        ProcesaArt analisis = new ProcesaArt(articulo);
        String esperado = "Aceptado";
        String actual = analisis.getComprobador().comprobar(analisis.getArticulo());
        assertEquals(esperado, actual);
    }
}