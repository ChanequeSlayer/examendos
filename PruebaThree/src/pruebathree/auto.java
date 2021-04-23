
package pruebathree;

public class auto {
    boolean motor;
    int pedal;
    boolean volante;
    String color;
    int llantas;
    
    public void avanzar(){
        if(motor==false&&volante==false){
            System.out.println("El auto no puede avanzar");
        } else
            System.out.println("El auto si puede avanzar");
    
    }
    
}
