package pe.edu.upeu.genericos.modelo;

public class Cliente {
    String nombre;
    String dni;
    String direccion;
    String telefono;

    public Cliente(String nombre, String dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
