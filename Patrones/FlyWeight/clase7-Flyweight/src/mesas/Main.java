package mesas;

public class Main {
    public static void main(String[] args){
        Bosque bosque = new Bosque();
        for(int i=0; i<1000000; i++){
            if(i<500000){
                bosque.plantarArbol("Ornamental");
            }
            else{
                bosque.plantarArbol("Frutal");
            }
        }
        bosque.getArbolesPorColor();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() -
                runtime.freeMemory()) / (1024 * 1024));
    }
}
