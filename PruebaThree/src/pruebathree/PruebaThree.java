//Prueba para ver si cambia el codigo, simplemente es un saludo.
package pruebathree;

public class PruebaThree {

    public static void main(String[] args) {
        System.out.println("Hola Mundo GitHub, Soy Andrew");
        int a = 1;
        int b = 2;
        System.out.println(a+b);
        System.out.println("En todo funcionan los cambios");
        System.out.println("En todo funcionan los cambios");
        
        PruebaThree si= new PruebaThree();
        si.mensaje();
        
        //objeto que llama al constructor
        algo otro=new algo();
        otro.girar(true/*aquí están los argumentos*/);
        
        //llamando el dato privado
        otro.setAzul(true);
        otro.isAzul();
        
    }
    public void mensaje(){
        System.out.println("Gracias por las clases nocturnas <3");
  
    }
}
