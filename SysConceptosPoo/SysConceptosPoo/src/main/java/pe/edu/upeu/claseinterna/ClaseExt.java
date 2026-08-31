package pe.edu.upeu.claseinterna;

public class ClaseExt {

    class ClaseIntUno{
         void saludo(){
        System.out.println("Soy clase interna uno");
         }
    }
    class ClasIntDos{
        void saludo(){
            System.out.println("Soy clase interna dos");
        }
        static void mostrarInformacion(){
            System.out.println("Los metodos staticos se pueden llamar de forma directa");
        }
    }
    public static void main (String[] args){
        ClaseExt ce=new ClaseExt();
        ClaseIntUno cIU=ce.new ClaseIntUno();
        cIU.saludo();
        ClasIntDos cID=ce.new ClasIntDos();
        cID.saludo();
        ClasIntDos.mostrarInformacion();
    }

}
