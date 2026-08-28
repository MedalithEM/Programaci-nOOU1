package pe.edu.upeu.conceptosuml.realizacion;

public class Pajaro implements Volador {
    @Override
    public void volar() {
        System.out.println("El avion vuela sobre las nubes");

    }

    @Override
    public void correr() {
        System.out.println("El avios antes de despegar corre");

    }
}
//override: sobre escribir, polimorfismo