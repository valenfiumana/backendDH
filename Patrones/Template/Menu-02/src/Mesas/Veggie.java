package Mesas;

public class Veggie extends Menu{
    private Integer especias;
    private Integer salsas;

    public Veggie(Double precioBase, Integer especias, Integer salsas) {
        super(precioBase);
        this.especias = especias;
        this.salsas = salsas;
    }

    public Integer getEspecias() {
        return especias;
    }

    public Integer getSalsas() {
        return salsas;
    }
}
