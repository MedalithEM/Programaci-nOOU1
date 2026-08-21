package pe.edu.upeu;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Producto> prod=new ArrayList<>();
//prod es un objeto
        prod.add(new Producto("P001", "Televisor",
                4000, 20 ));
        prod.add(new Producto("P002", "Parlantes",
                2000));
        var px=new Producto("POO3","Celular",3500);
                var cantiad=54.5;

        prod.add(px);

        for (Producto p: prod){
            System.out.println(p.nombre+"\t"+p.precio+"\t"+
                    p.stock+"\t"+p.igv);
        }
        System.out.println(px.getClass());
        System.out.println(cantiad);
        System.out.println(cantiad instanceof double);

    }
}