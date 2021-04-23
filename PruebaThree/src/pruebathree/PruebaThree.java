//Prueba para ver si cambia el codigo, simplemente es un saludo.
package pruebathree;

public class PruebaThree {
    
    int bbb;
    

    public static void main(String[] args) {
        System.out.println("Hola Mundo GitHub, Soy Andrew");
        int a = 1;
        int b = 2;
        double c = 3;
        System.out.println(a+b+c);
        
        PruebaThree abc = new PruebaThree();
        abc.suma();
        boolean respuesta=true;
        Auto at = new Auto();
        at.color="Rojo";
        at.motor=true;
        
        Auto deAlex = new Auto();
        deAlex.color= "Azul";
        deAlex.volante=true;
        
        System.out.println(deAlex.a(deAlex.color));
        
         System.out.println(at.a(at.color));
        
  
    }
    
    
    
    
    public void suma(){
    int d=3,h=5;
    int resultado = d*h/2+6;
    System.out.println(resultado);
    }
    
    
    
    
    
    
    
    
}
