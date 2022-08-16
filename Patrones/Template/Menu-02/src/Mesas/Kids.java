package Mesas;

public class Kids extends Menu{
    private Integer juguetes;

    public Kids(Double precioBase, Integer juguetes) {
        super(precioBase);
        this.juguetes = juguetes;
    }

    public Integer getJuguetes() {
        return juguetes;
    }
}
