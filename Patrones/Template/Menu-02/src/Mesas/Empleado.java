package Mesas;

public class Empleado {

    public String prepararMenu(Menu menu){
        return instrucciones(menu)+ ' '+calcularPrecio(menu);
    }
    public String instrucciones(Menu menu){
        if (menu instanceof Veggie){
            Integer especias=((Veggie) menu).getEspecias();
            Integer salsas=((Veggie) menu).getSalsas();
            return "Agregar "+ especias+" especias y "+salsas+" salsas";
        }
        if(menu instanceof Kids){
            Integer juguetes = ((Kids) menu).getJuguetes();
            return "Agregar "+ juguetes+" juguete(s)";
        }
        if(menu instanceof Clasic){
            return "No agregar nada";
        }
        return null;
    }
    public String calcularPrecio(Menu menu){
        Double precioTotal = menu.getPrecioBase();
        if (menu instanceof Veggie){
            Integer especias=((Veggie) menu).getEspecias();
            Integer salsas=((Veggie) menu).getSalsas();
            Double recargo=precioTotal*especias/100;
            precioTotal+=salsas*2+recargo;
            return "El precio del menu Veggie con "+ especias+" especias y "+salsas+" salsas es "+precioTotal;
        }
        else if(menu instanceof Kids){
            Integer juguetes = ((Kids) menu).getJuguetes();
            precioTotal+=juguetes*3;
            return "El precio del menu Kids con "+ juguetes+" juguete es "+precioTotal;
        }
        else if(menu instanceof Clasic){
            return "El precio del menu clasico es "+precioTotal;
        }
        return null;
    }
}
