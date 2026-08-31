package pe.edu.upeu.polimorfinterface;

public interface Animal {

     void emitirSonido();
     void dormir();

     static void prueba(){
          System.out.println("probando");

     }
     default void pruebad(){
          System.out.println("como default");
     }
}
//si el metodo es defaul se hace implementacion
