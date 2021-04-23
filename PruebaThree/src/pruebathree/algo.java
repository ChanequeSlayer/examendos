package pruebathree;

public class algo {
    //estrella
    Boolean brilla;
    int lados;
    String color;
    private boolean azul;
    
    //método constructor
    public algo(){
        brilla=true;
        lados=5;
        color="amarillo";
        azul=true;
        
    }
    //creación del método
    //dentro de los paréntesis van los parámetros y los argumentos (sin ellos el método no sabe), con las variables nos indicará si tiene o no algo
    public void girar(boolean brilla /*aquí están los parámetros*/){
        if(brilla==false){
            System.out.println("Si no brilla no girará la estrella");
        }else{
            System.out.println("Es una estrella giratoria");
        }    
    
    }
        //si los atributos se encuentran en "private" hay que utilizar el set y el get

    public boolean isAzul() {
        return azul;
    }

    public void setAzul(boolean azul) {
        this.azul = azul;
    }
}
//instanciar es dar valor a los atributos (consta del objeto y sus atributos)
