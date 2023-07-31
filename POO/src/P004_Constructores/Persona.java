
package P004_Constructores;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Métodos
    /*public Persona(){ // Es la forma predeterminada de la clase, puede estar o no 
    }*/
    
   // Se puede hacer de esta manera utilizando this
   /* public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }*/
    
    public Persona(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    
}
