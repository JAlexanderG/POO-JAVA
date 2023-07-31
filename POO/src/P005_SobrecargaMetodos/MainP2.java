
package P005_SobrecargaMetodos;

public class MainP2 {
    public static void main(String [] args){
        Persona p1 = new Persona("Alexander", 25);
        p1.correr();
        
        Persona p2 = new Persona("54125");
        p2.correr(10);
    }    
}
