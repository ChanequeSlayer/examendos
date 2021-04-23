//Prueba para ver si cambia el codigo, simplemente es un saludo.
package pruebathree;

import java.util.Scanner;

public class PruebaThree {

    public static void main(String[] args) {
        System.out.println("Hola Mundo GitHub, Soy Andrew");
        int a = 1;
        int b = 2;
        System.out.println(a+b);
        System.out.println("Andres es hermoso?");
        Scanner sc= new Scanner(System.in);
        
        String asd;
        
        asd=sc.nextLine();
        PruebaThree abc= new PruebaThree();
        abc.Mensaje();
        
        auto at=new auto();
        
        at.avanzar();
    }
    
    
    
    public void Mensaje(){
        System.out.println("Claro que no, el es perfecto");
    }
    
}
