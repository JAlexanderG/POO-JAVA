package P001_CreacionClasesObjetos;

// @author Alexander

public class Auto {
  // Atributos
    String color;
    String marca;
    int km;
    
    public static void main(String [] args){
        Auto auto1 = new Auto();
        
        auto1.color = "blanco";
        auto1.marca = "audi";
        auto1.km = 0;
        
        System.out.println("El color del coche1 es: " + auto1.color);
        System.out.println("La marca del coche1 es: " + auto1.marca);
        System.out.println("El kilometraje del coche1 es: " + auto1.km);
        
        Auto auto2 = new Auto();
        
        auto2.color = "rojo";
        auto2.marca = "ferrari";
        auto2.km = 100;
        
        System.out.println("\nEl color del coche2 es: " + auto2.color);
        System.out.println("La marca del coche2 es: " + auto2.marca);
        System.out.println("El kilometraje del coche2 es: " + auto2.km);
        
    }  
}
