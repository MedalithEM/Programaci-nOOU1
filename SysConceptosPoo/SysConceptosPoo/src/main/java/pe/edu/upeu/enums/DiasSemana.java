package pe.edu.upeu.enums;

import lombok.Getter;

import javax.print.DocFlavor;
@Getter
public enum DiasSemana {
    DOMINGO("Domingo"),
    LUNES("Lunes"),
    MARTES("Martes"),
    MIERCOLES("Miercoles"),
    JUEVES("Jueves"),
    VIERNES("Viernes"),
    SABADO("Sabado");

    String nombreDia; //si se podria usar encapsulamiento
    DiasSemana(String nombreDia){
        this.nombreDia=nombreDia;
    }
}
