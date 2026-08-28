package pe.edu.upeu.conceptosuml.asociacion;

public class Profesor {
   String nombre;
   Especialidad especialidad;

   Profesor(String nombre, Especialidad especialidad){
       this.nombre = nombre;
       this.especialidad = especialidad;
   }

   void ensehnar(){
       System.out.println("El profesor "+nombre+" enseña en la especialidad de "+especialidad.nombre);
   }

    public static void main(String[] args) {
        Profesor profesor=new Profesor("Pedro", new Especialidad("Matematicas"));
        profesor.ensehnar();
    }
}
//Metodo, obejeto (profesor porque esa instanciando a la clase profesor),